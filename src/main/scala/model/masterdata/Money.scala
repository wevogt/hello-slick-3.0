package model.masterdata

/**
 * Created by werner on 30.08.15.
 */
case class Money (var amount :BigDecimal = 0, curr :Currency)  {

  def + (m :Money) = Money(amount.bigDecimal.add(m.amount.bigDecimal), m.curr)

  //override def toString :String => println(f"$amount%.2f $curr.objectidc")

  // ToDo wie kann man die Formatierung abh. von curr.decimalDigits machen ?
  override def toString :String = f"$amount%.2f ${curr.objectidc}"
  //println(f"$name is $age years old, and weighs $weight%.2f pounds.")
}


