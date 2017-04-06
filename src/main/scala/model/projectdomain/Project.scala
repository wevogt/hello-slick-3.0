package model.projectdomain

import slick.dbio.SuccessAction
import slick.jdbc.H2Profile.api._
import slick.jdbc.meta.MTable
import slick.sql.SqlProfile.ColumnOption.NotNull

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
//import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 25.06.2015.
 */

object Project extends ((Option[Int], String, String, Option[Double]) => Project) {

  //implicit val format = Json.format[Project]

  def create(id: Option[Int], name: String, state: String, budget :Option[Double]) :Project =
  Project(id, name,state, budget)
}


case class Project(
                    id: Option[Int] = None,
                    name: String,
                    projectState: String,
                    bugdet: Option[Double] = None
  ) {
  override def toString() = "Project: id=" + id.getOrElse("undefied") + "\tname=" + name + "\tZustand=" + projectState + "\tBudget=" + bugdet.getOrElse(0)
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
  // the base query for the Projects table
  lazy val projects = TableQuery[ProjectTable]
  //val db = Database.forConfig("pgtest")
  val db = Database.forConfig("h2mem1")

  val findById = this.findBy(_.id)

  val tablesExist: DBIO[Boolean] = MTable.getTables.map { tables =>
    val names = Vector(projects.baseTableRow.tableName)
    names.intersect(tables.map(_.name.name)) == names
  }
  val create: DBIO[Unit] = (projects.schema).create
  val createIfNotExist: DBIO[Unit] = tablesExist.flatMap(exist => if (!exist) create else SuccessAction {})
  // wg. autoIncrement, werden die ID's hier ignoriert
  val insertProjects: DBIO[Option[Int]] = projects.map(p => (p.id, p.name, p.projectState)) ++= Seq( (100, "P100", "active"), (200, "P200", "closed"), (300, "P300", "initial"), (400, "P400", "paused"))
  val setup =  db.run(createIfNotExist >> insertProjects)

  Thread.sleep(500)   // ToDo: warten bis Tabelle angelegt und initale Datensaetze eingefuegt, besser waere "Await.result ...", wie ???


  /*
    def createInitial =   try {
      Await.result(db.run(DBIO.seq(
        // create the schema
        projects.schema.create,

        // insert two Project instances
        projects += Project(Some(100), "P100", "active"),
        projects += Project(Some(200), "P200", "closed", Some(99.0) ),
        projects += Project(Some(300), "P300", "initial"),
        projects += Project(Some(400), "P400", "paused")

        // print the users (select * from USERS)
       // projects.result.map(println)

      )), Duration.Inf)
    } finally db.close
  */

  def getById(id :Int) :Option[Project] =
    Await.result(db.run(projects.filter(_.id === id).result.headOption), Duration.Inf)

  def countProjects(): Int = Await.result(db.run(projects.length.result), Duration.Inf)

}