package services

import model.masterdata.{FxRates, FxRate, FxRateDAO}
import org.scalatest.BeforeAndAfterAll
import org.scalatest.time.Milliseconds
import slick.basic.DatabaseConfig
import slick.jdbc.H2Profile.api._
import slick.jdbc.JdbcProfile
//import slick.jdbc.OracleProfile.api._
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Span, Seconds}
import slick.ast.{Take, LiteralNode}
import slick.jdbc.meta.MTable
import slick.lifted.TableQuery
import utils.etl.services.FxImportService

/**
  * Created by werner on 20.04.17.
  */
class FxImportServiceTest extends FunSuite with BeforeAndAfter with BeforeAndAfterAll with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds), Span(60, Milliseconds))

  lazy val dbConfig = DatabaseConfig.forConfig[JdbcProfile]("great-h2mem-test")
  implicit lazy val profile: JdbcProfile = dbConfig.profile
  implicit lazy val db: JdbcProfile#Backend#Database = dbConfig.db

  val fxrateDAO =  FxRateDAO
  val fxrates = TableQuery[FxRates]
  val initialTestObjects = Seq(
    new  FxRate(' ', new java.sql.Date(System.currentTimeMillis()), " ", 0L)
  )


  def setupTestData() =
    DBIO.seq(
      (fxrates.schema).create,
      fxrates ++= initialTestObjects
    )

  override def beforeAll() {
    println("... running before")
    //db = Database.forConfig("great-h2mem-test")
    db.run(setupTestData())
  }

  test("Creating the Schema should works") {
    val tables = db.run(MTable.getTables).futureValue

    assert(tables.size >= 1)
    assert(tables.count(_.name.name.equalsIgnoreCase("fx_rates")) == 1)
  }


  test("ETL-Service FxImportService should works") {

    val importFile = "Great_FX_Rates.csv"
    val importPath = "./src/main/scala/utils/etl/importdata/"

    FxImportService.importFile(importPath.concat(importFile))

    assert(fxrates.take(100).toNode.asInstanceOf[Take].count.asInstanceOf[LiteralNode].value == 100)

    //val hundredRates: List[FxRate] = fxrates.take(99)
    assert(FxRateDAO.countAll >= 200000)

    //FxRateDAO.count(fxrates.take(99))

//    val hundredRates = for (rate <- fxrates.take(99)) yield rate
    assert(fxrateDAO.count(99) == 99)
  }

  override def afterAll() {
    printf("... test's finished, cleanup DB")
    db.io(fxrates.schema.drop)
    //db.close
  }

}
