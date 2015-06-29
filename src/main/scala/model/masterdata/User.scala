package model.masterdata

import play.api.libs.json.Json
import slick.{dbio, lifted}
import slick.lifted.ProvenShape
import slick.model.Table._
import slick.profile.SqlProfile.ColumnOption.NotNull
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

import scala.concurrent.{Await, Future}
import scala.language.postfixOps

//import slick.driver.H2Driver.api._
import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 09.06.2015.
 *
 * Companion Object mit Factory (create) und Reposityfunktionen
 * Case-Class und
 * Users f. DB-Model und DB-Actions
 */


object User {
  implicit val format = Json.format[User]
  //def apply(name: String, id: Option[Int] = None): User = new User(name, id)
  def create(name: String, id: Option[Int] = None):User = {
    User(name, id)
  }
  // aus DB lesen, ggf. auch aus einen Cache
  //def getById(id: Int):User = users.findById(id)
}

case class User(
   name: String,
   id: Option[Int] = None
  )

class UserTable(tag: Tag) extends Table[User](tag, "USERS") {
  // The name can't be null
  def name = column[String]("NAME", NotNull)
  // Auto Increment the id primary key column
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  // the * projection (e.g. select * ...) auto-transforms the tupled
  // column values to / from a User
  //def * = (name, id.?) <> (User.tupled, User.unapply)

  // wenn das Entity als CompanionObject definiert ist
  def * = (name, id.?) <> ((User.apply _).tupled, User.unapply _)

  // sollte immer gehen, aber unflexibel und umständlich
  //def * = (name, id.?) <> (String, Option[Int])
  //def * : ProvenShape[(String, Option[Int])] = (name,id.?)

/*
  def findById(id: Long): Future[Option[User]] =
    db.run(users.filter(_.id === id).result.headOption)
*/
}

  object Users extends TableQuery(new UserTable(_)) {
    lazy val users = TableQuery[UserTable]
    val db = Database.forConfig("pgtest")


    val findById = this.findBy(_.id)

    def getById(id: Int): Future[User] = {
      val q = users.filter(_.id === id).result
      db.run(q.head)
    }

/*
    def getById(id: Int): Future[Option[User]] = {

      val q = (for (e <- users if e.id === id) yield e)
      val action = q.result
      println("\tStatement: \n\t\t" + action.statements.head)
      db.run(action.headOption)
      //f.onSuccess {case s => println(s"Result: $s")}
//      println(q.result.statements)
      //q.result.headOption
      //db.run(users.filter(_.id === id).result.headOption)
      //Await.result(db.run(issueQuery.result), Duration.Inf)
    }
*/

    def getAll(): Future[Set[User]] = db.run(users.to[Set].result)
//    def getAll(): Future[Unit] = db.run(DBIO.seq(users.result.map(println)))

    def countUsers(): Future[Int] = db.run(users.length.result)
}


