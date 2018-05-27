package model.generator

import slick.codegen.SourceCodeGenerator
import slick.jdbc.OracleProfile
import slick.jdbc.meta._

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

//import org.h2.engine.Database
import slick.jdbc.OracleProfile.api._
import scala.language.postfixOps


/**
  * Reverse Engineering der GREAT-Datenbank -> CaseClasses und Tabledefinition
  * Beispiel von https://coderwall.com/p/hdcolg/slick-3-1-1-codegen-for-views
*/
object CreateModel extends App {

//  def main(args: Array[String]): Unit = {
    val dbConfig = "slick-oracle-great"  // in application.conf
    val db = Database.forConfig(dbConfig)
    val tablesAndViews = MTable.getTables(None, Some("WERNER2"), Some("GREAT_%"), Some(Seq("TABLE", "VIEW"))) //TABLE, and VIEW represent metadata, i.e. get database objects which are tables and views
    val modelAction = OracleProfile.createModel(Some(tablesAndViews))
    val modelFuture = db.run(modelAction)

/*
    // TestOnly
    Await.ready(
      modelFuture.map(_.tables -> println("dkfjskl"))
      , 15 minutes)
*/

    // customize code generator
    val codegenFuture = modelFuture.map(model => new SourceCodeGenerator(model))

    val path = getClass.getResource("").getPath
    println(s"Codegen: Path = $path")

    Await.ready(
      codegenFuture.map(_.writeToFile("slick.jdbc.OracleProfile", path, "greatdomain", "GreatReverseEngineered", "GreatAllTables.scala")), 5 minutes)

    println("... CodeGeneration finished")
// }

}
