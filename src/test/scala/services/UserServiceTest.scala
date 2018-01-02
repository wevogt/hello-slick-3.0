package services

import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Seconds, Span}
import slick.jdbc.H2Profile.api._

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.util.Success
//import slick.driver.HsqldbDriver.api._
import model.masterdata._
import slick.jdbc.meta._

class UserServiceTest extends FunSuite with BeforeAndAfter with BeforeAndAfterAll with ScalaFutures {
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

  test("Querying a User (not existing) should works") {

    val insertCount = Await.result(UserService.getAllUsers, 1.seconds).size
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

//    val allUsers: Future[List[User]] = UserService.getAllUsers
//    assert(allUsers.value.size >= 5)

//    for ( u:User <- allUsers.value) {
//      println("User-Id: " + u.id.get + ", Name: " + u.name)
//    }
  }

  test("asynchron Query Users should work") {
    val insertCount = Await.result(UserService.getAllUsers, 1.seconds).size
    assert(insertCount == 5)
  }

  test("synchron Query Users should work") {
    val insertCount = UserService.getAllUsersSynchron.size
    assert(insertCount == 5)
  }

  test("Insert/Update/Delete a User should works in async-Mode") {
    var allUsers: List[User] = Await.result(UserService.getAllUsers, 1.seconds)

    val newUser = User.create("James Bond", Some(7))

    UserService.addUser(newUser)
    allUsers = Await.result(UserService.getAllUsers, 1.seconds)
    assert(allUsers.size == 6)

    UserService.updateUser(newUser)

    val delSuccess = UserService.deleteUserByName("Bond James")
    //val delSuccess = UserService.deleteUserByName(newUser.name: String)
    allUsers = Await.result(UserService.getAllUsers, 1.seconds)
    assert(allUsers.size == 5)
    assert(delSuccess.value == Some(Success(1)))


    val delError = UserService.deleteUserByName(newUser.name: String)
    allUsers = Await.result(UserService.getAllUsers, 1.seconds)
    assert(allUsers.size == 5)
    assert(delError.value.contains(Success(0)))
  }

  override def afterAll() {
    printf("... test's finished, cleanup DB")
    db.io(users.schema.drop)
    db.close
  }

}
