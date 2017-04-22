package model.masterdata

import java.sql.Date

//import slick.profile.SqlProfile.ColumnOption.Nullable
//import slick.jdbc.H2Profile.api._
import slick.jdbc.PostgresProfile.api._

/**
 * Created by werner on 09.06.15.
 */

// Teilprojektion aus GREAT-Tabelle GREAT_CURRENCY
case class Currency(isocode: String, decimalDigits: Int, nameDE: String, nameEN: String, nameES: String, startDate: Date, endDate: Option[Date], fxType: Char ) {

//  val defaultCurrency = new Currency("EUR", 2, "?", "EUR", "EUR", new java.sql.Date(System.currentTimeMillis()), None, 'D')
}

class Currencies(tag: Tag) extends Table[Currency](tag, "CURRENCY") {
  def isoCode3 = column[String]("ISO_CODE3")
  def decimalDigits = column[Int]("NUMBER_OF_DECIMAL_DIGITS")
  def nameDE = column[String]("NAME_DE")
  def nameEN = column[String]("NAME_EN")
  def nameES = column[String]("NAME_ES")
  def startDate = column[Date]("START_DATE")
  def endDate = column[Option[Date]]("END_DATE")  // kann NULL sein
  //def endDate = column[Date]("END_DATE", Nullable)  // kann NULL sein
  def fxType = column[Char]("FXTYPE")

  def * = (isoCode3, decimalDigits, nameDE, nameEN, nameES, startDate, endDate, fxType) <> (Currency.tupled, Currency.unapply)
}

object CurrencyDAO extends TableQuery(new Currencies(_)) with BaseDAO[Currency] {
  import scala.concurrent.Await
  import scala.concurrent.duration.Duration
  import scala.concurrent.ExecutionContext.Implicits.global


  lazy val currencies = TableQuery[Currencies]

  def insert(currency: Currency): Unit = Await.result(db.run(currencies += currency).map( _ => ()), Duration.Inf)

  def countAll: Int = exec(currencies.length.result)
  def count(count: Int): Int = exec(currencies.take(count).length.result)

  def getCurrencyByIsoCode3(isocode: String): Seq[Currency] = exec[Seq[Currency]](currencies.filter(_.isoCode3 === isocode).result)

  def getInActiveCurrencies(): Seq[Currency] = exec[Seq[Currency]](currencies.filter(_.endDate < new java.sql.Date(System.currentTimeMillis())).result)
}