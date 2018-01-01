package services

import org.scalatest.{time, _}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Milliseconds, Seconds, Span}

import scala.language.postfixOps
//import slick.jdbc.H2Profile.api._
import slick.jdbc.OracleProfile.api._
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.util.{Failure, Success}
import slick.jdbc.meta._

import model.masterdata._

class UserServiceTest extends FunSuite with BeforeAndAfter with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds))

  var db: Database = _
  val users = TableQuery[UserTable]
  val initialTestObjects = Seq(
    User.create("John Doe", Option(1)),
    User.create("Fred Smith", Option(2)),
    User.create("Norma Jean", Option(3)),
    User.create("James Dean", Option(4)),
    User.create("Lucky Luke", Option(5))
  )

  def setupTestData() = {
    db.run(users.schema.drop)
    db.run(
      users.schema.create >> (users ++= initialTestObjects)
    )
  }

  before {
    db = Database.forConfig("slick-oracle")
    setupTestData()
  }

  test("Creating the Schema should works") {
    val tables = db.run(MTable.getTables).futureValue

    Thread.sleep(1000)
    assert(tables.size == 0)
//    assert(tables.count(_.name.name.equalsIgnoreCase("users")) == 1) // wieso funktioniert das unter Oracle nicht?
  }

  test("Querying a User (not existing) should works") {
    import scala.concurrent.ExecutionContext.Implicits.global

    val insertCount = Await.result(UserService.getAllUsers, 1.seconds).size
    assert(insertCount == 5)

    val hal42: Option[User] = UserService.getUserById(1)
    assert(hal42.getOrElse(User.create("Nobody", Some(99))).id.get == 1)

    val hal99: Option[User] = UserService.getUserById(99)
    assert(hal99.getOrElse(99) == 99)
  }
  
  test("Query Users should works") {
    val results = db.run(users.result).futureValue
    assert(results.size == initialTestObjects.size)
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
    assert(insertCount == initialTestObjects.size)
  }

  test("synchron Query Users should work") {
    val insertCount = UserService.getAllUsersSynchron.size
    assert(insertCount == initialTestObjects.size)
  }

  test("Insert/Update/Delete a User should works in async-Mode") {
    var allUsers: List[User] = Await.result(UserService.getAllUsers, 1.seconds)

    val newUser = User.create("James Bond", Some(99))

    UserService.addUser(newUser)
    allUsers = Await.result(UserService.getAllUsers, 1.seconds)
    assert(allUsers.size == (initialTestObjects.size + 1))

    // passiert eigentlich nichts
    UserService.updateUser(newUser)

    val delSuccess = UserService.deleteUserByName("Bond James")
    //val delSuccess = UserService.deleteUserByName(newUser.name: String)

    Thread.sleep(200)
    allUsers = Await.result(UserService.getAllUsers, 1.seconds)
    assert(allUsers.size == initialTestObjects.size)

    assert(delSuccess.value == Some(Success(1)))


    val delError = UserService.deleteUserByName(newUser.name: String)
    allUsers = Await.result(UserService.getAllUsers, 1.seconds)
    assert(allUsers.size == initialTestObjects.size)
    assert(delError.value.contains(Success(0)))
  }

  after {
    //db.run(users.schema.drop)
    db.close }

}
