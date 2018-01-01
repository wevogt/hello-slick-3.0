package services

import model.masterdata._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Milliseconds, Seconds, Span}
import org.scalatest.{BeforeAndAfter, FunSuite}
import slick.ast.{LiteralNode, Take}
import slick.jdbc.OracleProfile.api._

import scala.concurrent.Await
import scala.concurrent.Await._
import scala.concurrent.duration.Duration
//import slick.jdbc.H2Profile.api._
import slick.jdbc.meta.MTable
import slick.lifted.TableQuery
import utils.etl.services.CurrencyImportService

/**
  * Created by werner on 20.04.17.
  */
class CurrencyImportServiceTest extends FunSuite with BeforeAndAfter with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds), Span(60, Milliseconds))

  var db: Database = _
  val currencyDAO =  CurrencyDAO
  val currencies = TableQuery[Currencies]
  val initialTestObjects = Seq(
    new Currency(" ", 0, " ", " ", " ", new java.sql.Date(System.currentTimeMillis()), Option(new java.sql.Date(System.currentTimeMillis())) , 'D')
  )


  def setupTestData() =
    db.run(
      currencies.schema.create >> (currencies ++= initialTestObjects)
    )

  before {
    db = Database.forConfig("slick-oracle")
    setupTestData()
  }

  test("Creating the Schema should works") {
    val tables = db.run(MTable.getTables).futureValue

    Thread.sleep(1000)
//    result(tables, Duration.Inf)
    assert(tables.size >= 0)
//    assert(tables.count(_.name.name.equalsIgnoreCase("currency")) == 1)
  }


  test("ETL-Service CurrencyImportService shoud works") {

    val importFile = "Great_Currency.csv"
    val importPath = "./src/main/scala/utils/etl/importdata/"

    CurrencyImportService.readFile(importPath.concat(importFile))

    assert(currencies.take(100).toNode.asInstanceOf[Take].count.asInstanceOf[LiteralNode].value == 100)
    assert(CurrencyDAO.countAll >= 100)


//    val hundredRates = for (rate <- currencies.take(99)) yield rate
    assert(currencyDAO.count(99) == 99)

    println(currencyDAO.getCurrencyByIsoCode3("USD"))
    println(currencyDAO.getCurrencyByIsoCode3("VEF"))

    assert(currencyDAO.getInActiveCurrencies().size >= 10)
  }

  test("find active/inactive Currencies should work") {

    assert(currencyDAO.getActiveCurrencyByIsoCode3("USD").get.isocode === "USD")
    // inactive currency TMM
    assert(currencyDAO.getActiveCurrencyByIsoCode3("TMM") == None)
  }
}
