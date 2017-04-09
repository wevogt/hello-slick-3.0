package services

import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Seconds, Span}
import slick.jdbc.H2Profile.api._
//import slick.driver.HsqldbDriver.api._
import slick.jdbc.meta._

import model.masterdata._

class UserServiceTest extends FunSuite with BeforeAndAfter with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds))

  val users = TableQuery[ProjectTable]

  var db: Database = _

  def createSchema() =
    db.run((users.schema).create)
  //db.run((users.schema).create).futureValue

  def insertUsers(): Option[Int] =
    db.run(users ++= Seq(
      User.create("John Doe"),
      User.create("Fred Smith"),
      User.create("Norma Jean"),
      User.create("James Dean"),
      User.create("Lucky Luke")
    )).futureValue


  before {
    db = Database.forConfig("h2mem1")
    createSchema()
  }
  
  test("Creating the Schema should works") {
    //createSchema()
    
    val tables = db.run(MTable.getTables).futureValue

    assert(tables.size == 1)
    assert(tables.count(_.name.name.equalsIgnoreCase("users")) == 1)
  }

  test("Inserting a Users should works") {
    //createSchema()
    
    val insertCount = insertUsers()
    assert(insertCount == Some(5))

    val hal42: Option[User] = UserService.getUserById(1)
    assert(hal42.get.id == Some(1))
  }
  
  test("Query Users should works") {
    //createSchema()
    //insertUsers()

    val results = db.run(users.result).futureValue
    assert(results.size == 5)
    assert(results.head.name === "John Doe")

    val norma: User = UserService.getUserByName("Norma Jean").getOrElse(User.create("Kasperl", Some(99)))
    assert(norma.name == "Norma Jean")

    val allUsers: List[User] = UserService.getAllUsers
    assert(allUsers.size >= 5)

    for ( u:User <- allUsers) {
      println("User-Id: " + u.id.get + ", Name: " + u.name)
    }
  }
  
  after { db.close }
}
