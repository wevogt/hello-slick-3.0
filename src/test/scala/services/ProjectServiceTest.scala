package services

import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Seconds, Span}
import slick.jdbc.H2Profile.api._
//import slick.driver.HsqldbDriver.api._
import model.projectdomain._
import slick.jdbc.meta._

class ProjectServiceTest extends FunSuite with BeforeAndAfter with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds))

  var db: Database = _
  val projects = TableQuery[ProjectTable]
  val initialTestObjects = Seq(
    Project(Some(100), "P100", "active"),
    Project(Some(200), "P200", "closed", Some(99.0) ),
    Project(Some(300), "P300", "initial"),
    Project(Some(400), "P400", "paused")
  )

  def setupTestData() =
    //db.run((projects.schema).create).futureValue
    db.run(
      projects.schema.create >> (projects ++= initialTestObjects)
    )

  before {
    db = Database.forConfig("h2mem1")
    setupTestData()
  }

  test("Creating the Schema should works") {
    val tables = db.run(MTable.getTables).futureValue

    assert(tables.size >= 1)
    assert(tables.count(_.name.name.equalsIgnoreCase("projects")) == 1)
  }

  test("Inserting a Projects should works") {
    val insertCount = ProjectService.getAllProjects.size
    assert(insertCount == 4)

    val hal42: Option[Project] = ProjectService.getProjectById(1)
    assert(hal42.getOrElse(Project(Some(99), "Not Found", "closed")).id == Some(1))
  }

  test("Query Projects should works") {
    val results = db.run(projects.result).futureValue
    assert(results.size == 4)
    assert(results.head.name === "P100")

    val p1: Project = ProjectService.getProjectByName("P100").getOrElse(Project(Some(99), "Kasperl", "closed"))
    assert(p1.name == "P100")

    val allProjects: List[Project] = ProjectService.getAllProjects
    assert(allProjects.size >= 4)

    for ( p:Project <- allProjects) {
      println("Project-Id: " + p.id.get + ", Name: " + p.name)
    }
  }
  
  after { db.close }
}
