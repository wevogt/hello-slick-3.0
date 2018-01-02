package model.masterdata

import java.sql.Date
import java.sql.SQLException

//import slick.jdbc.H2Profile.api._
//import slick.jdbc.PostgresProfile.api._
import slick.jdbc.OracleProfile.api._
import slick.lifted.ForeignKeyQuery


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

  // A foreign key relation that can be navigated to create a join
  def isoCodeFK: ForeignKeyQuery[Currencies, Currency] =
    foreignKey("ISO_CODE3_FK", isoCode3, TableQuery[Currencies])(_.isoCode3)
}


object FxRateDAO extends TableQuery(new FxRates(_)) with BaseDAO[FxRate] {
  import scala.concurrent.Await
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.duration.Duration


  lazy val fxrates = TableQuery[FxRates]

  // ToDo Return Anzahl inserted Datensätze
  def insert(rate: FxRate): Unit = {
    var rowCount: Int = 0
    try {
      Await.result(db.run(fxrates += rate).map(_ => ()), Duration.Inf)
//      val insert: FixedSqlAction[Int, NoStream, Effect.Write] = fxrates += rate
//      val result: Future[Int] = db.run(insert)
//      rowCount = Await.result(result, Duration.Inf)
    } catch {
      case ref :SQLException => {
        println(s"Fatal Error, insert FxRateDAO:\n${ref.getLocalizedMessage}")
        throw ref
      }
      case _: Throwable => println("unknown Exception thrown")
    }
  }

  def countAll: Int = exec(fxrates.length.result)
  def count(count: Int): Int = exec(fxrates.take(count).length.result)

  def getFxRatesByIsoCode3(isocode3: String): Seq[FxRate] = exec[Seq[FxRate]](fxrates.filter(_.isoCode3 === isocode3).result)

/*
  // ToDo aktuellster Umrechnungskurs
  def getLatestFxRate(isocode3: String): Option[FxRate] = exec[Option[FxRate]](fxrates.filter(_.isoCode3 === isocode3).filter(_.fxdate >= Some(maxFxDate(isocode3).result)).map(_.fxrate))

  def maxFxDate(isocode3: String): Rep[Option[Date]] = exec[Rep[Option[Date]]](fxrates.filter(_.isoCode3 === isocode3).map(_.fxdate).max)
*/
}