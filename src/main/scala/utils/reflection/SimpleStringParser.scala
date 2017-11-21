package utils.reflection

import java.text.SimpleDateFormat

//import io.circe._
//import io.circe.generic.auto._
////import io.circe.parse._
//import io.circe.syntax._

import scala.util.Try
/**
  * Created by werner on 19.01.16.
  *
  * Source: https://meta.plasm.us/posts/2015/11/08/type-classes-and-generic-derivation/
  *
  */
trait RowParser[A] {
  def apply(s: String): A
}

trait SaferRowParser[A] {
  def apply(s: String): Option[A]
}

case class Person(name: String, age: Double)
case class Book(title: String, author: String, year: Int)
case class Country(name: String, population: Int, area: Double)

case class FxRateETL(fxtype: Char, fxdate: String, isoCode3: String, fxrate: Double)      //Workaround wg. Date-Parsing !


object SimpleStringParser extends App {

  val amy = Creator.create[Person]("Amy,54.2")
  val fred = Creator.create[Person]("Fred,23")
  val hamlet = Creator.create[Book]("Hamlet,Shakespeare,1600")
  val finland = Creator.create[Country]("Finland,4500000,338424")

  val usd = Creator.create[FxRateETL]("M,30.12.2015,USD,1.19")       // Trennzeichen ","

  val amdString = "M;30.08.02 00:00:00;AMD;549.6396"
  val amd = Creator.create[FxRateETL] (amdString)


  var simpleDateFormat: SimpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");

  val personParser: SaferRowParser[Person] = (s: String) => s.split(",").toList match {
    case List(name, age) => Some(Person(name, age.toDouble))
  }
  println(personParser("Amy,54.2"))
  println(amy)

  val bookParser: SaferRowParser[Book] = new SaferRowParser[Book] {
    def apply(s: String): Option[Book] = s.split(",").toList match {
      case List(title, author, year) => Try(Book(title, author, year.toInt)).toOption
      case _ => None
    }
  }
  println(bookParser("Hamlet,Shakespeare,1600"))
  println(bookParser("Hamlet,Shakespeare"))
  println(hamlet)                             // mit trait SaferRowParser erzeugt dieser Datensatz keine Exception
  println()                                   // mit trait SaferRowParser erzeugt dieser Datensatz keine Exception

  println(personParser("Nora Jean, 60"))

/*
  val fxrateParser: RowParser[FxRate] = new RowParser[FxRate] {
    def apply(s: String): FxRate = s.split(";").toList match {        // Trennzeichen ";"
      case List(fxtype, fxdate, isoCode, rate) => FxRate(fxtype.charAt(0),fxdate, isoCode, rate.toDouble)
    }
  }
*/

  val fxrateParser: RowParser[FxRateETL] = new RowParser[FxRateETL] {
    def apply(s: String): FxRateETL = s.split(";").toList match {
      case List(fxtype, fxdate, isoCode3, fxrate) => FxRateETL(fxtype.charAt(0),
        fxdate, isoCode3, fxrate.toDouble)
    }
  }

  var tmpRecord = "\"D\";31.12.2016;\"USD\";1.07"
  tmpRecord = tmpRecord.replaceAll("\"","")
  tmpRecord.startsWith("\"")
  println(fxrateParser(tmpRecord))

  println("AMD-Rate \"M;30.08.02 00:00:00;AMD;549.6396\"  to: " + fxrateParser(amdString))

  val usd_rate: FxRateETL =  fxrateParser(tmpRecord)
  println(s"USD-Rate = $usd_rate")
  //println(fxrateParser("D";31.12.2016;"USD";1.07)

  println(usd)
  println(amd)
  //  println(fxrateParser(";;;"))              // gerneriert Fehler ohne SaferRowParser
  //  println(fxrateParser(""))                 // gerneriert Fehler ohne SaferRowParser

}
