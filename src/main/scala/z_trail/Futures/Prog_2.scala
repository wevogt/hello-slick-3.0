package z_trail.Futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
/**
  * Sample for Futures in Scala
  * https://beyondthelines.net/computing/scala-future-and-execution-context/
  */
object Prog_2 {

  def taskA(): Future[Unit] = Future {
    debug("Starting taskA")
    Thread.sleep(1000)
    debug("Finished taskA")
  }

  def taskB(): Future[Unit] = Future {
    debug("Starting taskB")
    Thread.sleep(2000)
    debug("Finished taskB")
  }

  def main(args: Array[String]): Unit = {
    debug("Starting Main")
    taskA()
    taskB()
    debug("finished Main")
  }

  def debug(mesage: String): Unit = {
    val now = java.time.format.DateTimeFormatter.ISO_INSTANT
      .format(java.time.Instant.now())
      .substring(11, 23) //keep only time component
    val thread = Thread.currentThread().getName
    println(s"$now [$thread] $mesage")
  }
}
