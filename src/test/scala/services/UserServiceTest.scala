package services

import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Seconds, Span}
import slick.jdbc.H2Profile.api._

import scala.concurrent.Future
//import slick.driver.HsqldbDriver.api._
import slick.jdbc.meta._

import model.masterdata._

class UserServiceTest extends FunSuite with BeforeAndAfter with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds))

  var db: Database = _
  val users = TableQuery[UserTable]
  val initialTestObjects = Seq(
    User.create("John Doe"),
    User.create("Fred Smith"),
    User.create("Norma Jean"),
    User.create("James Dean"),
    User.create("Lucky Luke")
  )

  def setupTestData() =
  db.run(
    users.schema.create >> (users ++= initialTestObjects)
  )

  before {
    db = Database.forConfig("h2mem1")
    setupTestData()
  }
  
  test("Creating the Schema should works") {
    val tables = db.run(MTable.getTables).futureValue

    assert(tables.size == 1)
    assert(tables.count(_.name.name.equalsIgnoreCase("users")) == 1)
  }

  test("Inserting a Users should works") {
    val insertCount = UserService.getAllUsers.value.size
    assert(insertCount == 5)

    val hal42: Option[User] = UserService.getUserById(1)
    assert(hal42.getOrElse(User.create("Nobody", Some(99))).id.get == 1)

    val hal99: Option[User] = UserService.getUserById(99)
    assert(hal99.getOrElse(99) == 99)
  }
  
  test("Query Users should works") {
    val results = db.run(users.result).futureValue
    assert(results.size == 5)
    assert(results.head.name === "John Doe")

    val norma: User = UserService.getUserByName("Norma Jean").getOrElse(User.create("Kasperl", Some(99)))
    assert(norma.name == "Norma Jean")

    val allUsers: Future[List[User]] = UserService.getAllUsers
    assert(allUsers.value.size >= 5)

//    for ( u:User <- allUsers.value) {
//      println("User-Id: " + u.id.get + ", Name: " + u.name)
//    }
  }
  
  after { db.close }
}
