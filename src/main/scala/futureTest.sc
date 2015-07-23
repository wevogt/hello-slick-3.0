// zu Kap. "Welcome to the Future"  The Neophyte's Guide to Scala

// erster sequentieller schematischer Ablaufversuch für einen Cappucion

import scala.concurrent.Promise
import scala.util.Try
type CoffeeBeans = String
type GroundCoffee = String

// gemahlender Kaffee
case class Water(temperature: Int)
type Milk = String
type FrothedMilk = String // aufgeschäumte Milch
type Espresso = String
type Cappucino = String
// dummy implementations of the individuals steps:
def grindSeq(beans: CoffeeBeans): GroundCoffee = s"ground coffee of $beans"
def heatWaterSeq(water: Water): Water = water.copy(temperature = 85)
def frothMilkSeq(milk: Milk): FrothedMilk = s"frothed $milk"
def brewSeq(coffee: GroundCoffee, heatedWater: Water): Espresso = "espresso"
def combine(espreso: Espresso, frothedMilk: FrothedMilk): Cappucino = "cappucino"
// some exceptions for things might go wrong in the individual steps
// (we'll need som of them later, use the others when experimenting with tho code):
case class GrindingException(msg: String) extends Exception(msg)
case class FrothingException(msg: String) extends Exception(msg)
case class WaterBoilingException(msg: String) extends Exception(msg)
case class BrewingException(msg: String) extends Exception(msg)
// going through these steps sequentially!
def prepareCappucinoSeq(): Try[Cappucino] = for {
  ground <- Try(grindSeq("arabica beans"))
  water <- Try(heatWaterSeq(Water(25)))
  espresso <- Try(brewSeq(ground, water))
  foam <- Try(frothMilkSeq("milk"))
} yield combine(espresso, foam)
val myCappiSeq = prepareCappucinoSeq()
//
// with Scala-Future -> concurrently
//
import scala.concurrent.future
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Random
def grind(beans: CoffeeBeans): Future[GroundCoffee] = Future {
  println("start grinding...")
  Thread.sleep(Random.nextInt(2000))
  if (beans == "baked beans") throw GrindingException("are you joking?")
  println("finished grinding...")
  s"ground coffee of $beans"
}

def heatWater(water: Water): Future[Water] = Future {
  println("heating the water now")
  Thread.sleep(Random.nextInt(2000))
  println("hot, it's hot!")
  water.copy(temperature = 85)
}

def frothMilk(milk: Milk): Future[FrothedMilk] = Future {
  println("milk frothing system engaged!")
  Thread.sleep(Random.nextInt(2000))
  println("shutting down milk frothing system")
  s"frothed $milk"
}

def brew(coffee: GroundCoffee, heatedWater: Water): Future[Espresso] = Future {
  println("happy brewing :)")
  Thread.sleep(Random.nextInt(2000))
  println("it's brewed!")
  "espresso"
}

// going through these steps concurrently!
def prepareCappucino(): Future[Cappucino] = {
  val groundCoffee = grind("arabica beans")
  val heatedWater = heatWater(Water(25))
  val frothedMilk = frothMilk("milk")
  for {
    ground <- groundCoffee
    water <- heatedWater
    foam <- frothedMilk
    espresso <- brew(ground, water)
  } yield combine(espresso, foam)
}

val myCappi = prepareCappucino().isCompleted
import scala.util.{Success, Failure}
//future {grind("baked beans")}