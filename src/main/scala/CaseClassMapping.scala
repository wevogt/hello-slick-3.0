
import java.sql.Date
import slick.profile.SqlProfile.ColumnOption.NotNull

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
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




  try {
    println("Currencies:")
    //Await.result(db.run(currencies.filter(_.fxtype==='D').sortBy(_.isoCode).sortBy(_.fxdate.desc).result), Duration.Inf).foreach {
      Await.result(db.run(currencies.result), Duration.Inf).foreach {
        curr => println(curr)
    }
  } finally db.close


  //db.run(currencies.result).isCompleted

  println("... finished")
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
  def endDate = column[Date]("END_DATE")
  def fxType = column[Char]("FXTYPE")

  def * = (objectidc, decimalDigits, textDE, textEN, textES, startDate, endDate.?, fxType) <> (Currency.tupled, Currency.unapply)
}