package model.masterdata

import slick.jdbc.H2Profile.api._
import slick.sql.SqlProfile.ColumnOption.NotNull

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.language.postfixOps

//import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 09.06.2015.
 *
 * Companion Object mit Factory (create) und Reposityfunktionen
 * Case-Class und
 * Users f. DB-Model und DB-Actions
 */


object User {

  //implicit val format = Json.format[User]

  //def apply(name: String, id: Option[Int] = None): User = new User(name, id)
  def create(name: String, id: Option[Int] = None): User = {
    User(name, id)
  }
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
  def * = (name, id.?) <>((User.apply _).tupled, User.unapply _)

  // sollte immer gehen, aber unflexibel und umständlich
  //def * = (name, id.?) <> (String, Option[Int])
  //def * : ProvenShape[(String, Option[Int])] = (name,id.?)

}

object UserDAO extends TableQuery(new UserTable(_)) with BaseDAO {
  // the base query for the Users table
  lazy val users = TableQuery[UserTable]
  //val db = Database.forConfig("pgtest")
  //val db = Database.forConfig("h2mem1")

/*
  val tablesExist: DBIO[Boolean] = MTable.getTables.map { tables =>
    val names = Vector(users.baseTableRow.tableName)
    names.intersect(tables.map(_.name.name)) == names
  }

  def create: DBIO[Unit] = (users.schema).create
  //def create: Future[Unit] = db.run((users.schema).create)

  def createIfNotExist: DBIO[Unit] = tablesExist.flatMap(exist => if (!exist) create else SuccessAction {})

  def insertUsers: DBIO[Option[Int]] = users.map(u => (u.name)) ++= Seq(("John Doe"), ("Fred Smith"), ("Norma Jean"), ("James Dean"), ("Lucky Luke"))
  //val setup =  Await.result(db.run(createIfNotExist >> insertUsers), Duration(5, SECONDS))
  //val setup =  Await.result(db.run(createIfNotExist), Duration.Inf)
  val setup =  db.run(createIfNotExist >> insertUsers)
  //val setup =  db.run(createIfNotExist)
  Thread.sleep(2000)
*/

  def findById = users.findBy(_.id)

  def getById(id: Int): Option[User] =
    Await.result(db.run(users.filter(_.id === id).result.headOption), Duration.Inf)

  def findUserByName(userName: String) :Option[User] =
    exec[Option[User]](users.filter(_.name === userName).result.headOption)

  // gibt alle User in einer soriteren Liste zurueck
  def getAll(): Future[List[User]] = execImmediate(users.sortBy(_.id).to[List].result)
  //def getAll(): List[User] = Await.result(db.run(users.sortBy(_.id).to[List].result), Duration.Inf)

  //def getAll(): Set[User] = Await.result(db.run(users.sortBy(_.id).to[Set].result), Duration.Inf)
  //def getAll(): Unit = Await.result(db.run(DBIO.seq(users.result)), Duration.Inf)
  //def getAll(): Unit = Await.result(db.run(DBIO.seq(users.result.map(println))), Duration.Inf)
  //def getAll(): Future[Set[User]] = db.run(users.to[Set].result)

  def countUsers(): Int = Await.result(db.run(users.length.result), Duration.Inf)

  //def countUsers(): Future[Int] =db.run(users.length.result)
}


