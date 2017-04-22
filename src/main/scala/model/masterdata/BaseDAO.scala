package model.masterdata

import slick.basic.DatabasePublisher
import slick.jdbc.H2Profile.api._

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

/**
  * Created by werner on 12.04.17.
  */
trait BaseDAO [T] {

  lazy val db = Database.forConfig("h2mem1")
  val stmtTimeout: Duration = 1.seconds


  //Standard-DB-Anfrage, blockierend mit Time-Out
  def exec[T](action: DBIO[T]): T =
    Await.result(db.run(action), stmtTimeout)

  //Standard-DB-Anfrage, nicht blockierend!
  def execImmediate[T](action: DBIO[T]):  Future[T] = {
    db.run(action)

//    result.onSuccess {
//      case r => println(s"Result: $r")
//    }
  }

  //def insert[T]: Future[Unit]


/*
  //DB-Abfrage mit Ergebins als Stream
  def execStream[T](action: DBIO[_, Streaming[T], No): DatabasePublisher[T] =
    db.stream(action)
*/

}
