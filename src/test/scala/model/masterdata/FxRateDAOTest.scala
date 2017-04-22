package model.masterdata

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Seconds, Span}
import org.scalatest.{BeforeAndAfter, FunSuite}
import slick.ast.{LiteralNode, Take}
import slick.jdbc.H2Profile.api._
import slick.jdbc.meta.MTable
import slick.lifted.TableQuery
import utils.etl.services.FxImportService

/**
  * Created by werner on 20.04.17.
  */
class FxRateDAOTest extends FunSuite with BeforeAndAfter with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds))

  var db: Database = _
  val fxrateDAO =  FxRateDAO
  val fxrates = TableQuery[FxRates]
  val initialTestObjects = Seq(
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "USD", 1.15),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis() - (2*24*3600*1000L)), "USD", 1.11),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis() - (4*24*3600*1000L)), "USD", 1.07),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "AED", 2.4),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "EUR", 1.0),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "AUD", 1.4),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "VZN", 1400.20)
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

    assert(tables.size == 1)
    assert(tables.count(_.name.name.equalsIgnoreCase("fx_rates")) == 1)
    assert(FxRateDAO.countAll == initialTestObjects.size)
  }


  test("search Rate by IsoCode should works") {
    assert(FxRateDAO.getFxRatesByIsoCode3("USD").size == 3)

    assert(FxRateDAO.getFxRatesByIsoCode3("DXM").size == 0)
  }
}
