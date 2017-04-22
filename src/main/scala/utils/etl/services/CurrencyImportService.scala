package utils.etl.services

import java.text.SimpleDateFormat

import model.masterdata.{Currency, CurrencyDAO, FxRate, FxRateDAO}
import utils.reflection._

import scala.io.Source


/**
 * Created by werner on 17.04.17.
 */

case class CurrencyETL (
  isoCode: String,
  version: Int,
  lastuser: String,
  updatetimec: String,
  numDigits: Int,
  name_DE: String,
  name_EN: String,
  name_ES: String,
  startDate: String,
  endDate: Option[String],
  fxType: Char
)

object CurrencyImportService {

  val importFile = "Great_Currency.csv"
  val importPath = "/Users/werner/Workspace_Scala/hello-slick-3.0/src/main/scala/utils/etl/importdata/"

  //val simpleStringParser = SimpleStringParser.fxrateParser
  val skipHeaderLines: Int = 1


  def readFile(fileToImport: String): Unit = {
    var cnt: Int = 0
    var currencyRead: CurrencyETL = CurrencyETL(" ",0," "," ",0," "," "," "," ",Some(" "),' ')
    var currency: Currency = new Currency(" ", 0, " ", " ", " ", new java.sql.Date(System.currentTimeMillis()), Some(new java.sql.Date(System.currentTimeMillis())), 'D')

    try {
      for (line <- Source.fromFile(fileToImport).getLines()) {
        if (cnt >= skipHeaderLines) {
          CurrencyDAO.insert(currencyETLParser(line.replaceAll("\"","")))
        }
        cnt = cnt + 1
      }
    } catch {
      case ex: Exception => println(s"Bummer, an exception happened:\n $ex")
    }

    val recordsImported = CurrencyDAO.countAll
    println(s"\n... FxImportService, $recordsImported rates successfully imported")
  }


  // convertiert einen ETL-Record in ein FxRate-Object
  def currencyETLParser: RowParser[Currency] = new RowParser[Currency] {
    val expectedDateFormat: String = "dd.MM.yy hh:mm:ss"
    def formatter: SimpleDateFormat = new SimpleDateFormat(expectedDateFormat)
    def setDefaultDateIfEmpty(date: String): String = {
      if (date.isEmpty) "31.12.2999 00:00:00"
      else
        date
    }

    def apply(s: String): Currency = s.split(",").toList match {
      case List(isoCode, version, lastUser, updatetimec, numDigits, name_DE, name_EN, name_ES, startDate, endDate, fxType) =>
        Currency(isoCode, numDigits.toInt, name_DE, name_EN, name_ES, new java.sql.Date(formatter.parse(startDate).getTime), Option(new java.sql.Date(formatter.parse(setDefaultDateIfEmpty(endDate)).getTime)), fxType.charAt(0))
    }
  }


/*
    def fxRateParser: FxRate = {
    val expectedDateFormat: String = "dd.MM.yy hh:mm:ss"
    def formatter: SimpleDateFormat = new SimpleDateFormat(expectedDateFormat)

    def apply(etl: FxRateETL): FxRate = etl match {
      case etl => FxRate(etl.fxtype, new java.sql.Date(formatter.parse(etl.fxdate).getTime), etl.isoCode, etl.rate)
    }
  }
*/
}
