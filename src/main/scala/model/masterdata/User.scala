package model.masterdata

import play.api.libs.json.Json
import slick.dbio.Effect.Read
import slick.dbio.SuccessAction
import slick.jdbc.meta.MTable
import slick.sql.SqlProfile.ColumnOption.NotNull

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.language.postfixOps

import slick.jdbc.H2Profile.api._

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
  def * = (name, id.?) <>((User.apply _).tupled, User.unapply _)

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
  //val db = Database.forConfig("pgtest")
  val db = Database.forConfig("h2mem1")

  val findById = this.findBy(_.id)

  val tablesExist: DBIO[Boolean] = MTable.getTables.map { tables =>
    val names = Vector(users.baseTableRow.tableName)
    names.intersect(tables.map(_.name.name)) == names
  }
  val create: DBIO[Unit] = (users.schema).create
  val createIfNotExist: DBIO[Unit] = tablesExist.flatMap(exist => if (!exist) create else SuccessAction {})
  val insertUsers: DBIO[Option[Int]] = users.map(u => (u.name)) ++= Seq(("John Doe"), ("Fred Smith"), ("Norma Jean"), ("James Dean"), ("Lucky Luke"))
  val setup =  db.run(createIfNotExist >> insertUsers)

  /*
      def getById(id: Int): Future[User] = {
        val q = users.filter(_.id === id).result
        db.run(q.head)
      }
      //def getById(id: Int):User = db.filter(_.id === id).map()

    def getById(id: Int) :Future[User] = {
      val q = for (u <- users if u.id === id) yield u
      val action :DBIO[User] = q.result.head
      //println("\tStatement: \n\t\t" + action.statements.head)
      db.run(action)
      //val future: Future[User] = db.run(action)
      //Await.result(future,Duration.Inf)
      //future.onSuccess {case s => map(println).result}
      //future.onSuccess {case s => println(s"Result: $s")}
      //      println(q.result.statements)
      //q.result.headOption
  //    db.run(users.filter(_.id === id).result.headOption).mapTo[User]
    }
  */

  def getById(id: Int): Option[User] =
    Await.result(db.run(users.filter(_.id === id).result.headOption), Duration.Inf)

  // gibt alle User in einer soriteren Liste zurueck
  def getAll(): List[User] = Await.result(db.run(users.sortBy(_.id).to[List].result), Duration.Inf)

  //def getAll(): Set[User] = Await.result(db.run(users.sortBy(_.id).to[Set].result), Duration.Inf)
  //def getAll(): Unit = Await.result(db.run(DBIO.seq(users.result)), Duration.Inf)
  //def getAll(): Unit = Await.result(db.run(DBIO.seq(users.result.map(println))), Duration.Inf)
  //def getAll(): Future[Set[User]] = db.run(users.to[Set].result)

  def countUsers(): Int = Await.result(db.run(users.length.result), Duration.Inf)

  //def countUsers(): Future[Int] =db.run(users.length.result)
}


