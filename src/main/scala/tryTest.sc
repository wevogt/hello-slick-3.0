
import scala.util.Try
import java.net.URL

def parseURL(url: String): Try[URL] = Try(new URL(url))

parseURL("http://danielwestheide.com")
parseURL("garbage")

//val url = parseURL(Console.readLine("URL: ")).getOrElse(
//new URL("http://duckduckgo.com")
//)

parseURL("http://www.danielwestheide.com").map(_.getProtocol)
import java.io.InputStream
def inputStreamForURL(url: String): Try[InputStream] =
    parseURL(url).flatMap { u =>
    Try(u.openConnection()).flatMap( conn => Try(conn.getInputStream))
}
val in = inputStreamForURL("http://www.siemens.com")
in.foreach(println)

import scala.io.Source
def getURLContent(url: String): Try[Iterator[String]] =
  for {
      url <- parseURL(url)
      connection <- Try(url.openConnection())
      is <- Try(connection.getInputStream)
      source = Source.fromInputStream(is)
  } yield source.getLines()


import scala.util.Success
import scala.util.Failure
getURLContent("http://www.siemens.com") match {
  case Success(lines) =>
    lines.foreach(println)
  case Failure(ex) =>
    println(s"Problem rendering URL content: ${ex.getMessage}")
}
