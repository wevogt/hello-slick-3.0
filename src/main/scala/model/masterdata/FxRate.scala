package model.masterdata

import java.sql.Date

import slick.jdbc.H2Profile.api._
//import slick.jdbc.PostgresProfile.api._


/**
 * Created by werner on 09.06.15.
 */
// Beispiel aus GREAT
case class FxRate(fxtype: Char, fxdate: Date, isoCode3: String, fxrate: Double) {
  override def toString() = "FXRate: " + fxtype + "\t" + fxdate + "\t" + isoCode3 + "\t" + fxrate
}

class FxRates(tag: Tag) extends Table[FxRate](tag, "FX_RATES") {
  def fxtype = column[Char]("FXTYPE")
  def fxdate = column[Date]("FXDATE")
  def isoCode3 = column[String]("ISO_CODE3")
  def fxrate = column[Double]("FXRATE")

  def * = (fxtype, fxdate, isoCode3, fxrate) <> (FxRate.tupled, FxRate.unapply)
}


object FxRateDAO extends TableQuery(new FxRates(_)) with BaseDAO[FxRate] {
  import scala.concurrent.Await
  import scala.concurrent.duration.Duration
  import scala.concurrent.ExecutionContext.Implicits.global


  lazy val fxrates = TableQuery[FxRates]

  def insert(rate: FxRate): Unit = Await.result(db.run(fxrates += rate).map( _ => ()), Duration.Inf)

  def countAll: Int = exec(fxrates.length.result)
  def count(count: Int): Int = exec(fxrates.take(count).length.result)

  def getFxRatesByIsoCode3(isocode3: String): Seq[FxRate] = exec[Seq[FxRate]](fxrates.filter(_.isoCode3 === isocode3).result)
}