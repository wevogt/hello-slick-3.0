
import model.masterdata._
import java.sql.Date
import java.util.Calendar
import slick.profile.SqlProfile.ColumnOption.{Nullable, NotNull}

import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.language.postfixOps

//import slick.driver.H2Driver.api._
import slick.driver.PostgresDriver.api._

object CurrencyMapping extends App {

  val fxrates = TableQuery[FxRates]
  val currencies = TableQuery[Currencies]

  //  val db = Database.forConfig("h2mem1")
  val db = Database.forConfig("pgtest")

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
  val dailyRate = fxTypes.head
  val monthlyRate = fxTypes.tail.head
  val showMaxRecords :Int = 100

  println("starting at " + new java.sql.Timestamp(System.currentTimeMillis()))

  try {

    val setupFuture: Future[Unit] = db.io()
    val f = setupFuture.flatMap { _ =>
      println("\nall valid Currency.Iso-Codes (= objectidc):")
      val currenciesQuery: Query[Rep[String], String, Seq] =
        currencies
          .filter( t => t.fxType ===  dailyRate || t.fxType === monthlyRate )     // OR
          .filter(_.startDate <= today)
          .filter(_.endDate isEmpty)
          //.filter(_.decimalDigits >= 1)
          .sortBy(_.objectidc.desc)
          .map(_.objectidc)

      println("Statement: \n" +
        currenciesQuery.result.statements)

      db.run(currenciesQuery.result).map(println)

    }.flatMap { _ =>
      // Beispiel f�r aktuell g�ltige ISO-Codes
      // Soll:    Distinct und SET als Ergebnis
      // Problem: EndDate ist meist NULL (optional) oder darf > today sein
      println("\ndistinct valid Currencies:")
      //val currenciesCountQuery: Rep[Future[Seq[String]]] =
      val currenciesCountQuery: Query[Rep[String], String, Seq] =
        currencies
          //          .filter(_.fxType between ('D', 'M'))
          //.filter(t => t.fxType === 'D' || t.fxType === 'M') // OR
          //          .filter( t: slick.lifted.Rep[_] => fxTypes.contains(t.fxType) )     // OR
          .filter(_.startDate <= today)
          .filter(_.endDate isEmpty)
          //          .filter( t => Some(t.endDate) > today || t.endDate === null)
          .sortBy(_.objectidc)
          .map(c => c.objectidc)

      println("Statement: \n" +
        currenciesCountQuery.result.statements)

      db.run(currenciesCountQuery.length.result).map(println)
      db.run(currenciesCountQuery.to[Set].result).map(println)
      db.run(currenciesCountQuery.to[IndexedSeq].result).map(println)

    }.flatMap { _ =>
      println("\nCurrency and Currencyname:")

      val currencyDetailQuery = currencies.filter(t => t.fxType === dailyRate || t.fxType === monthlyRate).sortBy(_.objectidc).map(c => (c.objectidc, c.textDE))

      println("Statement: \n" + currencyDetailQuery.result.statements)

      db.run(currencyDetailQuery.result.map(println))

    }.flatMap { _ =>
      val rates = fxrates
       db.run(rates.length.result).map(println)

      //println("all FXRates: " + cnt)

    }.flatMap { _ =>
      println(s"\n$showMaxRecords FxRates-ISO-Codes:")
      //val ratesQuery = fxrates.filter(_.fxtype==='D').sortBy(_.isoCode).sortBy(_.fxdate.asc).take(50).map(_)
      val ratesQuery = fxrates.filter(_.fxtype=== dailyRate).sortBy(_.isoCode).sortBy(_.fxdate.asc).take(showMaxRecords).map(_.isoCode)

      println("Statement: \n" +
        ratesQuery.result.statements)

      db.run(ratesQuery.result).map(println)

    }.flatMap { _ =>
      println(s"\n$showMaxRecords FxRates (ohne Stream):")
//      val allRatesQuery = fxrates.filter(_.fxtype === 'D').sortBy(_.isoCode).sortBy(_.fxdate.desc).take(50).map(r => (r.isoCode, r.rate, r.fxdate))
      val allRatesQuery = fxrates.sortBy(_.isoCode).sortBy(_.fxdate.desc).take(showMaxRecords).map(r => (r.isoCode, r.rate, r.fxdate))

      println("Statement: \n" +
        allRatesQuery.result.statements)

      db.run(allRatesQuery.result).map(println)

    }.flatMap { _ =>
      println(s"\n$showMaxRecords FxRates (mit Streaming db.stream(...)):")
      //val allRatesQuery = fxrates.filter(_.fxtype === 'D').sortBy(_.isoCode).sortBy(_.fxdate.desc).take(50).map(_)
      val allRatesQuery = fxrates.filter(_.isoCode === "USD").take(showMaxRecords).sortBy(_.isoCode).sortBy(_.fxdate.desc).map(r => (r.isoCode, r.rate, r.fxtype, r.fxdate))
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

//    ToDo: aktuellster Umrechungskurs pro Waehrung, wie in Bilanz, wenn 'D' und 'M' existieren, dann Monatsschlusskurs nehmen!!!

  } finally db.close

  println("finished at " + new java.sql.Timestamp(System.currentTimeMillis()))
  println("\n... finished")

}

