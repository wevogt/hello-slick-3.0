package services

import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Seconds, Span}
import slick.basic.DatabaseConfig
import slick.lifted.TableQuery
import slick.jdbc.H2Profile.api._
//import slick.driver.HsqldbDriver.api._
import model.projectdomain._
import slick.jdbc.meta._
import slick.dbio.DBIO
import slick.jdbc.JdbcProfile

class ProjectServiceTest extends FunSuite with BeforeAndAfter with BeforeAndAfterAll with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds))

  lazy val dbConfig = DatabaseConfig.forConfig[JdbcProfile]("great-h2mem-test")
  implicit lazy val profile: JdbcProfile = dbConfig.profile
  implicit lazy val db: JdbcProfile#Backend#Database = dbConfig.db

  val projects = TableQuery[ProjectTable]
  val initialTestObjects = Seq(
    Project(Some(100), "P100", "active"),
    Project(Some(200), "P200", "closed", Some(99.0) ),
    Project(Some(300), "P300", "initial"),
    Project(Some(400), "P400", "paused")
  )

  def setupTestData() =
    //db.run((projects.schema).create).futureValue
    //db.run(
      DBIO.seq (
        (projects.schema).create ,
        projects ++= initialTestObjects
      )

  override def beforeAll() {
    println("... running before")
    db.run(setupTestData())
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
  
  //after { db.close }
}
