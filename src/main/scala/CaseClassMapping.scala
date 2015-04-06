
import java.sql.Date
import java.util.Calendar
import slick.profile.SqlProfile.ColumnOption.{Nullable, NotNull}

import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.language.postfixOps

//import slick.driver.H2Driver.api._
import slick.driver.PostgresDriver.api._


object CaseClassMapping extends App {

  // the base query for the Users table
  val users = TableQuery[Users]
  val fxrates = TableQuery[FxRates]
  val currencies = TableQuery[Currencies]

  //  val db = Database.forConfig("h2mem1")
  val db = Database.forConfig("pgtest")

  /*
  try {
    Await.result(db.run(DBIO.seq(
      // create the schema
      /*
            users.schema.create,

            // insert two User instances
            users += User("John Doe"),
            users += User("Fred Smith"),
            users += User("Norma Jean"),
            users += User("James Dean"),
      */

      // print the users (select * from USERS)
      users.result.map(println)

    )), Duration.Inf)
  } finally db.close
*/


  /*
  try {
    println("FxRates:")
      Await.result(db.run(fxrates.filter(_.fxtype==='D').sortBy(_.isoCode).sortBy(_.fxdate.asc).take(50).result), Duration.Inf).foreach {
      //Await.result(db.run(fxrates.filter(_.isoCode === "USD").filter(_.fxtype === 'M').result), Duration.Inf).foreach {
           rate => println(rate)
      }
  } finally db.close
*/

  val today: java.sql.Date  = new Date(System.currentTimeMillis())
  val fxTypes: List[Char] = List('D','M')

  println("starting at " + new java.sql.Timestamp(System.currentTimeMillis()))

  try {

    val setupFuture: Future[Unit] = db.io()
    val f = setupFuture.flatMap { _ =>
      println("\nall Currency.Iso-Codes (= objectidc):")
      val currenciesQuery: Query[Rep[String], String, Seq] =
        currencies
          .filter( t => t.fxType === 'D' || t.fxType === 'M')     // OR
          .filter(_.startDate <= today)
          .filter(_.endDate isNull)
          //.filter(_.decimalDigits >= 1)
          .sortBy(_.objectidc.desc)
          .map(_.objectidc)

      println("Statement: \n" +
        currenciesQuery.result.statements)

      db.run(currenciesQuery.result).map(println)

    }.flatMap { _ =>
      // Beispiel für aktuell gültige ISO-Codes
      // Soll:    Distinct und SET als Ergebnis
      // Problem: EndDate ist meist NULL (optional) oder darf > today sein
      println("\ndistinct CurrenciesCount:")
      //val currenciesCountQuery: Rep[Future[Seq[String]]] =
      val currenciesCountQuery: Query[Rep[String], String, Seq] =
        currencies
          //          .filter(_.fxType between ('D', 'M'))
          //.filter(t => t.fxType === 'D' || t.fxType === 'M') // OR
          //          .filter( t: slick.lifted.Rep[_] => fxTypes.contains(t.fxType) )     // OR
          .filter(_.startDate <= today)
          .filter(_.endDate isNull)
          //          .filter( t => Some(t.endDate) > today || t.endDate === null)
          .sortBy(_.objectidc)
          .map(c => c.objectidc)

      println("Statement: \n" +
        currenciesCountQuery.result.statements)

      db.run(currenciesCountQuery.length.result).map(println)
      db.run(currenciesCountQuery.to[Set].result).map(println)
      db.run(currenciesCountQuery.to[IndexedSeq].result).map(println)

    }.flatMap { _ =>
      println("\nCurrencyDetail:")

      val currencyDetailQuery = currencies.filter(t => t.fxType === 'D' || t.fxType === 'M').sortBy(_.objectidc).map(c => (c.objectidc, c.textDE))

      println("Statement: \n" + currencyDetailQuery.result.statements)

      db.run((currencyDetailQuery.result).map(println))

    }.flatMap { _ =>
      println("\nFxRates:")
      //val ratesQuery = fxrates.filter(_.fxtype==='D').sortBy(_.isoCode).sortBy(_.fxdate.asc).take(50).map(_)
      val ratesQuery = fxrates.filter(_.fxtype==='D').sortBy(_.isoCode).sortBy(_.fxdate.asc).take(90).map(_.isoCode)

      println("Statement: \n" +
        ratesQuery.result.statements)

      db.run(ratesQuery.result).map(println)

    }.flatMap { _ =>
      println("\nall FxRates (ohne Stream):")
      //val allRatesQuery = fxrates.filter(_.fxtype === 'D').sortBy(_.isoCode).sortBy(_.fxdate.desc).take(50).map(_)
      val allRatesQuery = fxrates.sortBy(_.isoCode).sortBy(_.fxdate.desc).take(90).map(r => (r.isoCode, r.rate, r.fxdate))
//      val allRatesQuery = fxrates.sortBy(_.isoCode).sortBy(_.fxdate.desc).take(90).map(_)

      println("Statement: \n" +
        allRatesQuery.result.statements)

      db.run(allRatesQuery.result).map(println)

    }.flatMap { _ =>
      println("\nall FxRates (mit Streaming):")
      //val allRatesQuery = fxrates.filter(_.fxtype === 'D').sortBy(_.isoCode).sortBy(_.fxdate.desc).take(50).map(_)
      val allRatesQuery = fxrates.filter(_.isoCode === "USD").sortBy(_.isoCode).sortBy(_.fxdate.desc).map(r => (r.isoCode, r.rate, r.fxdate))
      //      val allRatesQuery = fxrates.sortBy(_.isoCode).sortBy(_.fxdate.desc).take(90).map(_)

      println("Statement: \n" +
        allRatesQuery.result.statements)

      val p = db.stream(allRatesQuery.result)

      // Stream-Consument
      p.foreach { s => println(s"Element: $s") }

    }.flatMap { _ =>

      /* Computed Values */

      // Create a new computed column that calculates the max price
      val maxFxdateColumn: Rep[Option[Date]] = fxrates.map(_.fxdate).max

      println("\nGenerated SQL for max fxdate column:\n" + maxFxdateColumn.result.statements)

      // Execute the computed value query
      db.run(maxFxdateColumn.result).map(println)

    }

    Await.result(f, Duration.Inf)

  } finally db.close

  println("finished at " + new java.sql.Timestamp(System.currentTimeMillis()))
  println("\n... finished")

}

case class User(name: String, id: Option[Int] = None)

class Users(tag: Tag) extends Table[User](tag, "USERS") {
  // Auto Increment the id primary key column
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  // The name can't be null
  def name = column[String]("NAME", NotNull)
  // the * projection (e.g. select * ...) auto-transforms the tupled
  // column values to / from a User
  def * = (name, id.?) <> (User.tupled, User.unapply)
}

// Beispiel aus GREAT
case class FxRate(fxtype: Char, fxdate: Date, isoCode: String, rate: Double){
  override def toString() = "FXRate: " + fxtype + "\t" + fxdate + "\t" + isoCode + "\t" + rate
}

class FxRates(tag: Tag) extends Table[FxRate](tag, "GREAT_FX_RATES") {
  def fxtype = column[Char]("FXTYPE")
  def fxdate = column[Date]("FXDATE")
  def isoCode = column[String]("ISO_CODE")
  def rate = column[Double]("RATE")

  def * = (fxtype, fxdate, isoCode, rate) <> (FxRate.tupled, FxRate.unapply)
}

// Teilprojektion aus GREAT-Tabelle GREAT_CURRENCY
case class Currency(objectidc: String, decimalDigits: Int, textDE: String, textEN: String, textES: String, startDate: Date, endDate: Option[Date], fxType: Char )

class Currencies(tag: Tag) extends Table[Currency](tag, "GREAT_CURRENCY") {
  def objectidc = column[String]("OBJECTIDC")
  def decimalDigits = column[Int]("NUM_DECIMAL_DIGITS")
  def textDE = column[String]("TEXT_DE")
  def textEN = column[String]("TEXT_EN")
  def textES = column[String]("TEXT_ES")
  def startDate = column[Date]("START_DATE")
//  def endDate = column[Option[Date]]("END_DATE")  // kann NULL sein
  def endDate = column[Date]("END_DATE", Nullable)  // kann NULL sein
  def fxType = column[Char]("FXTYPE")

  def * = (objectidc, decimalDigits, textDE, textEN, textES, startDate, endDate.?, fxType) <> (Currency.tupled, Currency.unapply)
}