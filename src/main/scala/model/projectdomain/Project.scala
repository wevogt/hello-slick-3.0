package model.projectdomain

import play.api._
import play.api.libs.json._
import slick.profile.SqlProfile.ColumnOption.NotNull

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.concurrent.duration.Duration._

//import slick.driver.H2Driver.api._
import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 25.06.2015.
 */
object Project extends ((Option[Int], String, String, Option[Double]) => Project) {
  implicit val format = Json.format[Project]
}

case class Project(
                    id: Option[Int] = None,
                    name: String,
                    projectState: String,
                    bugdet: Option[Double] = None
  ) {
  override def toString() = "Project: " + id + "\tname=" + name + "\tZustand=" + projectState
}

class ProjectTable(tag: Tag) extends Table[Project](tag, "PROJECTS") {
  // Auto Increment the id primary key column
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def name = column[String]("NAME", NotNull)
  def projectState = column[String]("PROJECTSTATE", NotNull)
  def budget = column[Option[Double]]("BUDGET")

  def * = (id.?, name, projectState, budget) <> ((Project.apply _).tupled, Project.unapply _)
}

object Projects extends TableQuery(new ProjectTable(_)) {
  //  val db = Database.forConfig("h2mem1")
  val db = Database.forConfig("pgtest")
  // the base query for the Users table
  lazy val projects = TableQuery[ProjectTable]


  val findById = this.findBy(_.id)

  def createInitial =   try {
    Await.result(db.run(DBIO.seq(
      // create the schema
      projects.schema.create,

      // insert two Project instances
      projects += Project(Some(100), "P100", "active"),
      projects += Project(Some(200), "P200", "closed"),
      projects += Project(Some(300), "P300", "initial"),
      projects += Project(Some(400), "P400", "paused")

      // print the users (select * from USERS)
     // projects.result.map(println)

    )), Duration.Inf)
  } finally db.close

}