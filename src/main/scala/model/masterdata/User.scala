package model.masterdata

import slick.lifted
import slick.model.Table._
import slick.profile.SqlProfile.ColumnOption.NotNull

import scala.concurrent.Future
import scala.language.postfixOps

//import slick.driver.H2Driver.api._
import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 09.06.2015.
 */
case class User(name: String, id: Option[Int] = None)

class Users(tag: Tag) extends Table[User](tag, "USERS") {
  // Auto Increment the id primary key column
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  // The name can't be null
  def name = column[String]("NAME", NotNull)

  // the * projection (e.g. select * ...) auto-transforms the tupled
  // column values to / from a User
  def * = (name, id.?) <>(User.tupled, User.unapply)

  val users = TableQuery[Users]
  val db = Database.forConfig("pgtest")

/*
  def findById(id: Long): Future[Option[User]] =
    db.run(users.filter(_.id === id).result.headOption)
*/

  def findById(id: Int): DBIO[Option[User]] = {
    val q = (for (e <- users if e.id === id) yield e)
    println(q.result.statements)
    q.result.headOption
  }
}


