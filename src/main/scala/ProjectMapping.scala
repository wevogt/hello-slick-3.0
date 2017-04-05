import model.projectdomain._
//import org.scalatest.fixture
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.language.postfixOps

import slick.jdbc.H2Profile.api._
//import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 09.06.2015.
 */
object ProjectMapping extends App {

  val db = Database.forConfig("h2mem1")
  //val db = Database.forConfig("pgtest")
  // the base query for the Users table
  //val projects = TableQuery[ProjectTable]

  val p = Project

  Projects.createInitial
  // ToDo wie kann man den create abhaengig machen davon ob die Tabelle schon besteht
  //if (Projects.exists equals false)  Projects.createInitial

  //var p100 = Project(Some(100), )
  var p100  = Projects.getById(1)
  println("neues Projekt = " + p100)

  //println("\nget project by Id=2; " + Projects.getById(2).get)
}
