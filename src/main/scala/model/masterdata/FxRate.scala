package model.masterdata

import java.sql.Date

//import slick.jdbc.H2Profile.api._
import slick.jdbc.PostgresProfile.api._


/**
 * Created by werner on 09.06.15.
 */
// Beispiel aus GREAT
case class FxRate(fxtype: Char, fxdate: Date, isoCode: String, rate: Double) {
  override def toString() = "FXRate: " + fxtype + "\t" + fxdate + "\t" + isoCode + "\t" + rate
}

class FxRates(tag: Tag) extends Table[FxRate](tag, "GREAT_FX_RATES") {
  def fxtype = column[Char]("FXTYPE")

  def fxdate = column[Date]("FXDATE")

  def isoCode = column[String]("ISO_CODE")

  def rate = column[Double]("RATE")

  def * = (fxtype, fxdate, isoCode, rate) <> (FxRate.tupled, FxRate.unapply)
}
