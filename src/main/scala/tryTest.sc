
import scala.util.Try
import java.net.{URL, URLConnection}

def parseURL(url: String): Try[URL] = Try(new URL(url))

def setConnectionWithBrowser(url :URL): URLConnection = {
  val connection :URLConnection = url.openConnection()
  connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.1.4322)");
  connection
}

parseURL("http://danielwestheide.com")
parseURL("garbage").getOrElse("Nothing")

parseURL("https://www.instagram.com/ari_maj/")


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
      connection <- Try(setConnectionWithBrowser(url))
      is <- Try(connection.getInputStream)
      source = Source.fromInputStream(is)
  } yield source.getLines()


import scala.util.Success
import scala.util.Failure
//getURLContent("http://www.kindgirls.com/gallery/babes/khyanna_65873/6545/") match {
//getURLContent("http://adultboard.net/threads/met-art-com-niemira-dilawa-02-07-2016.12781") match {
//getURLContent("http://fapat.me/upload/big/2016/11/30/583e3c59a98f5.jpg") match {
//getURLContent("http://gif-jpg.com/img-577805f5d3cbc.html") match {
//getURLContent("http://www.danielwestheide.com") match {

getURLContent("http://www.ari-maj.com") match {
  case Success(lines) =>
    lines.foreach(println)
  case Failure(ex) =>
    println(s"Problem rendering URL content: ${ex.getMessage}")
}
