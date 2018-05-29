package model.masterdata

import java.sql.SQLException

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Span, Seconds}
import org.scalatest.{BeforeAndAfter, FunSuite}
import slick.basic.DatabaseConfig
import slick.jdbc.H2Profile.api._
import slick.jdbc.JdbcProfile
import slick.jdbc.meta.MTable
import slick.lifted.TableQuery

/**
  * Created by werner on 20.04.17.
  */
class FxRateDAOTest extends FunSuite with BeforeAndAfter with ScalaFutures {
  implicit override val patienceConfig = PatienceConfig(timeout = Span(1, Seconds))

  lazy val dbConfig = DatabaseConfig.forConfig[JdbcProfile]("great-h2mem-test")
  implicit lazy val profile: JdbcProfile = dbConfig.profile
  implicit lazy val db: JdbcProfile#Backend#Database = dbConfig.db

  import scala.concurrent.duration._
  val timeout = 500 milliseconds

  val milliSecondsPerDay: Long = 24*3600*1000L
  val fxrateDAO =  FxRateDAO
  val currencies = TableQuery[Currencies]
  val initialTestCurrencies = Seq(
    Currency("USD", 2,"Dollar", "Dollar", "dolar", new java.sql.Date(System.currentTimeMillis() - 1000*milliSecondsPerDay), Some(new java.sql.Date(System.currentTimeMillis() + 1000*milliSecondsPerDay)), 'D' ),
    Currency("AED", 3,"AED-Dollar", "AED-Dollar", "dolar", new java.sql.Date(System.currentTimeMillis() - 1000*milliSecondsPerDay), Some(new java.sql.Date(System.currentTimeMillis() + 1000*milliSecondsPerDay)), 'D' ),
    Currency("EUR", 2,"Euro", "Euro", "euro", new java.sql.Date(System.currentTimeMillis() - 1000*milliSecondsPerDay), Some(new java.sql.Date(System.currentTimeMillis() + 1000*milliSecondsPerDay)), 'D' ),
    Currency("AUD", 2,"AU-Dollar", "AU-Dollar", "dolar", new java.sql.Date(System.currentTimeMillis() - 1000*milliSecondsPerDay), Some(new java.sql.Date(System.currentTimeMillis() + 1000*milliSecondsPerDay)), 'D' ),
    Currency("VZN", 2,"Ven.Pesos", "Peso", "peso", new java.sql.Date(System.currentTimeMillis() - 1000*milliSecondsPerDay), Some(new java.sql.Date(System.currentTimeMillis())), 'D' )
  )

  val fxrates = TableQuery[FxRates]
  val initialTestObjects = Seq(
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "USD", 1.15),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis() - (2*milliSecondsPerDay)), "USD", 1.11),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis() - (4*milliSecondsPerDay)), "USD", 1.07),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "AED", 2.4),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "EUR", 1.0),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "AUD", 1.4),
    new  FxRate('D', new java.sql.Date(System.currentTimeMillis()), "VZN", 1400.20)
  )


  def setupTestData() =
    DBIO.seq(
      (currencies.schema ++ fxrates.schema).create,
      currencies ++= initialTestCurrencies,
      fxrates ++= initialTestObjects
    )

  before {
    db.run(setupTestData())
  }

  test("Creating the Schema should works") {
    val tables = db.run(MTable.getTables).futureValue

    assert(tables.size >= 1)
    assert(tables.count(_.name.name.equalsIgnoreCase("fx_rates")) == 1)
    assert(FxRateDAO.countAll == initialTestObjects.size)
  }


  test("search Rate by IsoCode should works") {
    assert(FxRateDAO.getFxRatesByIsoCode3("USD").size == 3)

    assert(FxRateDAO.getFxRatesByIsoCode3("DXM").size == 0)
  }

  test("insert a fxrate without existing curreny.iscode3, no existing foreign key, should fail") {
    val fxrateWithoutFK = FxRate('M', new java.sql.Date(System.currentTimeMillis()), "XXX", 1400.20)
    assertThrows[SQLException] {FxRateDAO.insert(fxrateWithoutFK)}
    assert(FxRateDAO.getFxRatesByIsoCode3("XXX").size == 0)
  }

}
