package model.masterdata

import java.sql.Date

//import slick.profile.SqlProfile.ColumnOption.Nullable
//import slick.driver.H2Driver.api._
import slick.driver.PostgresDriver.api._

/**
 * Created by werner on 09.06.15.
 */

// Teilprojektion aus GREAT-Tabelle GREAT_CURRENCY
case class Currency(objectidc: String, decimalDigits: Int, textDE: String, textEN: String, textES: String, startDate: Date, endDate: Option[Date], fxType: Char )

class Currencies(tag: Tag) extends Table[Currency](tag, "GREAT_CURRENCY") {
  def objectidc = column[String]("OBJECTIDC")
  def decimalDigits = column[Int]("NUM_DECIMAL_DIGITS")
  def textDE = column[String]("TEXT_DE")
  def textEN = column[String]("TEXT_EN")
  def textES = column[String]("TEXT_ES")
  def startDate = column[Date]("START_DATE")
  def endDate = column[Option[Date]]("END_DATE")  // kann NULL sein
  //def endDate = column[Date]("END_DATE", Nullable)  // kann NULL sein
  def fxType = column[Char]("FXTYPE")

  def * = (objectidc, decimalDigits, textDE, textEN, textES, startDate, endDate, fxType) <> (Currency.tupled, Currency.unapply)
}