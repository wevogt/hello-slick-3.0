import model.projectdomain._
//import org.scalatest.fixture
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.language.postfixOps

//import slick.driver.H2Driver.api._
import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 09.06.2015.
 */
object ProjectMapping extends App {

  //  val db = Database.forConfig("h2mem1")
  //val db = Database.forConfig("pgtest")
  // the base query for the Users table
  //val projects = TableQuery[ProjectTable]

  val p = Project

  //Projects.createInitial
  // ToDo wie kann man den create abh�ngig machen ob die Tabelle schon besteht
  if (Projects.exists == false)  Projects.createInitial

  //var p100 = Project(Some(100), )
  var p100  = Projects.findById(100)
  println("neues Projekt = " + p100)

/*
  // finding Norma Jean
  val normaId: Long  = 7
  try {
//    Await.result(users findById(normaId), Duration.Inf).get
    Await.result(users.filter(_.id === normaId), Duration.Inf).get
  } finally db.close
*/
}
