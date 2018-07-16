package repositories

import repositories.dbCommon.DbConfiguration
import repositories.model.User
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Milliseconds, Span}

import scala.concurrent.Await

class UsersRepositoryTest extends FunSuite with DbConfiguration
  with Matchers with  BeforeAndAfter with ScalaFutures  with BeforeAndAfterEach {

  implicit override val patienceConfig = PatienceConfig(timeout = Span(500, Milliseconds))

  val users = new UsersRepository(config)

  def before = {
    Await.result(users.init(), patienceConfig.timeout)
  }

  def afterAll = {
    Await.result(users.drop(), patienceConfig.timeout)
  }

  test ("User should be inserted successfully")  {
    //implicit ee: ExecutionContext =>
    val user = User(None, "a@b.com", Some("Tom"), Some("Tommyknocker"))
    assert( users.insert(user) == user.copy(id = Some(1)) )
  }

//  override def execute(runnable: Runnable): Unit = ???

//  override def reportFailure(cause: Throwable): Unit = ???
}
