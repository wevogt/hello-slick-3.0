package model.masterdata

import slick.dbio.{FailureAction, SuccessAction}
//import slick.jdbc.H2Profile.api._
import slick.sql.SqlProfile.ColumnOption.NotNull

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.util.Success
import slick.jdbc.OracleProfile.api._

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
  //def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def id = column[Int]("ID", O.PrimaryKey) // wg. Oracle und autoimcrement

  // the * projection (e.g. select * ...) auto-transforms the tupled
  // column values to / from a User
  //def * = (name, id.?) <> (User.tupled, User.unapply)

  // wenn das Entity als CompanionObject definiert ist
  def * = (name, id.?) <>((User.apply _).tupled, User.unapply _)

  // sollte immer gehen, aber unflexibel und umständlich
  //def * = (name, id.?) <> (String, Option[Int])
  //def * : ProvenShape[(String, Option[Int])] = (name,id.?)

}

object UserDAO extends TableQuery(new UserTable(_)) with BaseDAO[User] {

  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Awaitable
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
    exec(users.filter(_.id === id).result.headOption)

  def findUserByName(userName: String) :Option[User] =
    exec[Option[User]](users.filter(_.name === userName).result.headOption)

  // gibt alle User in einer soriteren Liste zurueck
  //def getAll(): Future[List[User]] = execImmediate(users.sortBy(_.id).to[List].result)
  def getAll():  Future[List[User]] = execImmediate(users.sortBy(_.id).to[List].result)
  def getAllSynchron(): List[User] = exec(users.sortBy(_.id).to[List].result)

  //def getAll(): Set[User] = Await.result(db.run(users.sortBy(_.id).to[Set].result), Duration.Inf)
  //def getAll(): Unit = Await.result(db.run(DBIO.seq(users.result)), Duration.Inf)
  //def getAll(): Unit = Await.result(db.run(DBIO.seq(users.result.map(println))), Duration.Inf)
  //def getAll(): Future[Set[User]] = db.run(users.to[Set].result)

  def countUsers(): Int = exec(users.length.result)

  //def countUsers(): Future[Int] =db.run(users.length.result)

  //override
  //def insert(u: User): Future[Unit] = insert(u)
  def insert(u: User): Unit = Await.result(db.run(users += u).map( _ => ()), Duration.Inf)
  //def insert(u: User): Unit = Await.result(insert(u), Duration.Inf)


  //def update(u: User): Unit = Await.result(db.run(users.filter(_.name === "James Bond").map(_.name).update("Bond James")),Duration.Inf)
  def update(u: User): Future[Int] = {
    val userToUpdate = users.filter(_.name === "James Bond").map(_.name).update("Bond James")
    val stmt = userToUpdate.statements
    println(s"update UserStmt: $stmt")
    execImmediate(userToUpdate)
  }

  def deleteUserByName(userName: String): Future[Int] = {
    val removeUser: DBIO[Int] = users.filter(_.name === userName).delete
    val stmt = users.filter(_.name === userName).delete.statements
    println(s"deleteUserByName-Stmt: $stmt")
    execImmediate(removeUser)
    //val f: Future[Int] = execImmediate(removeUser)
    //f.value.get.get
//    f.result(Duration.Inf)(Await.ready(f))

/*
    f.onComplete {
      case s =>  s.get
      case _ => -1
    }
*/
/*
    f.onComplete{
      case SuccessAction() => 1
      case _ => -1
      //case FailureAction(e) => -1
    }
*/
  }


}


