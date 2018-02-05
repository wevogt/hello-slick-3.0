package model

import model.masterdata.User
import org.scalatest.{FlatSpec, Matchers}
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile

import scala.concurrent.ExecutionContext.Implicits.global

class DatabaseConfigTest extends FlatSpec with Matchers {
  def withDb(test: DatabaseConfig[JdbcProfile] => Any) = {
    val dbConfig = DatabaseConfig.forConfig[JdbcProfile]("great-h2mem-test")

    implicit val profile: JdbcProfile = dbConfig.profile
    implicit val db: JdbcProfile#Backend#Database = dbConfig.db
    /* The api for the driver specified in the config is imported here. */
    import dbConfig.profile.api._

    try test(dbConfig)
    finally dbConfig.db.close()
  }

  "DatabaseConfig" should "work" in withDb { dbConfig =>
    import model.masterdata.User._

    //import Suppliers._
//    val names = User.map(_.name)
//
//    dbConfig.db.run(cities.result).map(_.foreach(println))
  }
}