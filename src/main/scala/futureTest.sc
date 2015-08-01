// zu Kap. "Welcome to the Future"  The Neophyte's Guide to Scala

// erster sequentieller schematischer Ablaufversuch f�r einen Cappucion

import scala.concurrent.{Await, Promise}
import scala.util.Try
type CoffeeBeans = String
type GroundCoffee = String
// gemahlender Kaffee
case class Water(temperature: Int)
type Milk = String
type FrothedMilk = String // aufgesch�umte Milch
type Espresso = String
type Cappucino = String
// dummy implementations of the individuals steps:
def grindSeq(beans: CoffeeBeans): GroundCoffee = s"ground coffee of $beans"
def heatWaterSeq(water: Water): Water = water.copy(temperature = 85)
def frothMilkSeq(milk: Milk): FrothedMilk = s"frothed $milk"
def brewSeq(coffee: GroundCoffee, heatedWater: Water): Espresso = "espresso"
def combine(espreso: Espresso, frothedMilk: FrothedMilk): Cappucino = "speciale cappucino"
// some exceptions for things might go wrong in the individual steps
// (we'll need som of them later, use the others when experimenting with tho code):
case class GrindingException(msg: String) extends Exception(msg)
case class FrothingException(msg: String) extends Exception(msg)
case class WaterBoilingException(msg: String) extends Exception(msg)
case class BrewingException(msg: String) extends Exception(msg)
/*
// going through these steps sequentially!
def prepareCappucinoSeq(): Try[Cappucino] = for {
  ground <- Try(grindSeq("arabica beans"))
  water <- Try(heatWaterSeq(Water(25)))
  espresso <- Try(brewSeq(ground, water))
  foam <- Try(frothMilkSeq("milk"))
} yield combine(espresso, foam)
val myCappiSeq = prepareCappucinoSeq()
*/
//
// with Scala-Future -> concurrently
//
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Random
//
def grind(beans: CoffeeBeans): Future[GroundCoffee] = Future {
  println("start, grinding...")
  Thread.sleep(Random.nextInt(2000))
  if (beans == "baked beans") throw GrindingException("are you joking?")
  println("finished grinding")
  s"ground coffee of $beans"
}
def heatWater(water: Water): Future[Water] = Future {
  println("start, heating the water now")
  Thread.sleep(Random.nextInt(2000))
  println("finished heating water!")
  water.copy(temperature = 85)
}
def frothMilk(milk: Milk): Future[FrothedMilk] = Future {
  println("start, milk frothing system engaged!")
  Thread.sleep(Random.nextInt(2000))
  println("shutting down milk frothing system")
  s"frothed $milk"
}
def brew(coffee: GroundCoffee, heatedWater: Water): Future[Espresso] = Future {
  println("start, happy brewing :)")
  Thread.sleep(Random.nextInt(2000))
  println("finished brewing!")
  "espresso"
}

// going through these steps concurrently!
def prepareCappucino(): Future[Cappucino] = {
  println("... please wait, I'm preparing your cappucino!\n")
  val groundCoffee = grind("arabica beans")
  //val groundCoffee = grind("baked beans")
  val heatedWater = heatWater(Water(25))
  val frothedMilk = frothMilk("Landliebe-Milch")
  //println("... " + Await.result(groundCoffee, Duration.Inf))
  //println("... foam of " + Await.result(frothedMilk, Duration.Inf))
  for {
    ground <- groundCoffee
    water <- heatedWater
    foam <- frothedMilk
    espresso <- brew(ground, water)
  } yield combine(espresso, foam)
}
val myCapp = Await.result(prepareCappucino(),Duration.Inf)
println("\nprego una " + myCapp + ", bella donna")
//
import scala.util.{Success, Failure}
//future {grind("baked beans")}
//grind("baked beans").onComplete{
//  case Success(ground) => println(s"got my $ground")
//  case Failure(ex) => println("This grinder needs a replacement, seriously")
//}