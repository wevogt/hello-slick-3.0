package services

import model.masterdata.{FxRate, FxRateDAO, FxRates}
import slick.jdbc.H2Profile.api._
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Seconds, Span}
import slick.ast.{LiteralNode, Take}
import slick.jdbc.meta.MTable
import slick.lifted.TableQuery
import utils.etl.services.FxImportService

/**
  * Created by werner on 20.04.17.
  */
class FxImportServiceTest extends FunSuite with BeforeAndAfter with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds))

  var db: Database = _
  val fxrateDAO =  FxRateDAO
  val fxrates = TableQuery[FxRates]
  val initialTestObjects = Seq(
    new  FxRate(' ', new java.sql.Date(System.currentTimeMillis()), " ", 0L)
  )


  def setupTestData() =
    db.run(
      fxrates.schema.create >> (fxrates ++= initialTestObjects)
    )

  before {
    db = Database.forConfig("h2mem1")
    setupTestData()
  }

  test("Creating the Schema should works") {
    val tables = db.run(MTable.getTables).futureValue

    assert(tables.size >= 1)
    assert(tables.count(_.name.name.equalsIgnoreCase("fx_rates")) == 1)
  }


  test("ETL-Service FxImportService shoud works") {

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

}
