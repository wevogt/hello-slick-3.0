package model

import model.masterdata.UserDAO
import org.scalatest.{BeforeAndAfterEach, FlatSpec, Matchers}
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile

import scala.concurrent.Await

class DatabaseConfigTest extends FlatSpec with Matchers with BeforeAndAfterEach {

  import scala.concurrent.duration._
  val timeout = 500 milliseconds

  def withDb(test: DatabaseConfig[JdbcProfile] => Any) = {
    val dbConfig = DatabaseConfig.forConfig[JdbcProfile]("great-h2mem-test")

    implicit val profile: JdbcProfile = dbConfig.profile
    implicit val db: JdbcProfile#Backend#Database = dbConfig.db

    try test(dbConfig)
    println("Test withBD, DbEnv = " + dbConfig.db.source)
    db.createSession()

    db.close()

//    finally dbConfig.db.close()
  }

  override def beforeEach(): Unit = {
    Await.result(UserDAO.init(), timeout)
  }


  override def afterEach(): Unit = {
    UserDAO.drop()
  }


  "DatabaseConfig" should "work" in withDb { db =>
    import model.masterdata._

    val test = 42
    val names = UserDAO.users.baseTableRow.tableName
    println("UserTable-Name = " + names)

    assert(UserDAO.countUsers() == 5)
    assert(db.profileIsObject)
  }

}