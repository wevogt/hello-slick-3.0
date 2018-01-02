package z_trail.Futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

/**
  * Sample for Futures in Scala
  * Using Futures and asynchron Tasks, and multiple tasks
  * https://beyondthelines.net/computing/scala-future-and-execution-context/
  *
  * Achtung mit VM-Option -Dscala.concurrent.context.maxThreads=1 kann man die Parallelitaet steuern
  * Default scheint 8 Threads zu sein
  * Steuerung geht auch ueber sbt (buggy ?)
  */
object Prog_3 {

  def startTask(number: Int): Future[Unit] = Future {
    debug(s"Starting task#$number")
    Thread.sleep(2000)
    debug(s"Finished task#$number")
  }

  def main(args: Array[String]): Unit = {
    debug("Starting Main")
    val tasks = Future.traverse(1 to 20)(startTask)

    debug("continuing Main")
    // wait for all tasks to complete before exiting
    Await.result(tasks, Duration.Inf)
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
