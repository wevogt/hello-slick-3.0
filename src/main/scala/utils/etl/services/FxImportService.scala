package utils.etl.services;

import java.text.SimpleDateFormat

import model.masterdata.{FxRate, FxRateDAO}
import utils.reflection._

import scala.io.Source


/**
 * Created by werner on 17.04.17.
 */
object FxImportService {

  val importFile = "Great_FX_Rates.csv"
  val importPath = "/Users/werner/Workspace_Scala/hello-slick-3.0/src/main/scala/utils/etl/importdata/"

  val skipHeaderLines: Int = 1

  //val doIt = readFile(importPath.concat(importFile))

  def importFile(fileToImport: String): Unit = {
    var cnt: Int = 0
//    var fxRateRead: FxRateETL = new FxRateETL(' ', " ", " ", 0L)
//    var fxRate: FxRate = new FxRate(' ', new java.sql.Date(System.currentTimeMillis()), " ", 0L)

    try {
      for (line <- Source.fromFile(fileToImport).getLines()) {
        if (cnt >= skipHeaderLines) {
          FxRateDAO.insert(fxRateETLParser(line.replaceAll("\"","")))
        }
        cnt = cnt + 1
      }
    } catch {
      case ex: Exception => println(s"Bummer, an exception happened:\n $ex")
    }

    val recordsImported = FxRateDAO.countAll
    println(s"\n... FxImportService, $recordsImported rates successfully imported")
  }


  // convertiert einen ETL-Record in ein FxRate-Object
  def fxRateETLParser: RowParser[FxRate] = new RowParser[FxRate] {
    val expectedDateFormat: String = "dd.MM.yy hh:mm:ss"
    def formatter: SimpleDateFormat = new SimpleDateFormat(expectedDateFormat)

    def apply(s: String): FxRate = s.split(",").toList match {
      case List(fxtype, fxdate, isoCode3, rate) =>
        FxRate(fxtype.charAt(0), new java.sql.Date(formatter.parse(fxdate).getTime), isoCode3, rate.toDouble)
    }
  }

}
