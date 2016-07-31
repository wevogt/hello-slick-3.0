//import java.sql.Date
import java.util.{Calendar, Date}

import model.masterdata.{Currency, Money}

import scala.collection.mutable


val today: java.sql.Date  = new java.sql.Date(System.currentTimeMillis())
val yesterday: java.sql.Date = new java.sql.Date(today.getTime - (60*60*24*1000))

val current = Calendar.getInstance().getTime()
println(current.toString.formatted("dd.mm.yyyy"))
val now = new java.sql.Timestamp(System.currentTimeMillis())
val types = List('D','M')
types.contains('D')
types.foreach( _ =='M')
//val codes = Vector(ZMW, ZAR, YER, XPF, XOF, XCD, XAF, WST, VUV, VND, VEF, UZS, UYU, USD, UGX, UAH, TZS, TWD, TTD, TRY, TOP, TND, TMT, TJS, THB, SZL, SYP, SVC, STD, SRD, SOS, SLL, SHP, SGD, SEK, SDG, SCR, SBD, SAR, RWF, RUB, RSD, RON, QAR, PYG, PLN, PKR, PHP, PGK, PEN, PAB, OMR, NZD, NPR, NOK, NIO, NGN, NAD, MZN, MYR, MXN, MWK, MVR, MUR, MRO, MOP, MNT, MKD, MGA, MDL, MAD, LYD, LSL, LRD, LKR, LBP, LAK, KZT, KYD, KWD, KRW, KMF, KHR, KGS, KES, JPY, JOD, JMD, ISK, IRR, IQD, INR, ILS, IDR, HUF, HTG, HRK, HNL, HKD, GYD, GTQ, GNF, GMD, GIP, GHS, GEL, GBP, FKP, FJD, EUR, ETB, ERN, EGP, DZD, DOP, DKK, DJF, CZK, CVE, CUP, CRC, COP, CNY, CLP, CHF, CDF, CAD, BZD, BYR, BWP, BTN, BSD, BRL, BOB, BND, BMD, BIF, BHD, BGN, BDT, BBD, BAM, AZN, AWG, AUD, ARS, AOA, ANG, AMD, ALL, AFN, AED)


//Beispiel f. arithmetischen Datentyp (Money has amount and Currency)
val EUR = Currency("EUR", 2, "?", "Euro", "euro", today,  None, 'M')
val USD = Currency("USD", 4, "US$", "Dollar", "Dollar", today,  None, 'M')
val AED = Currency("AED", 0, "AE$", "AED-Dollar", "AEDDollar", today,  None, 'D')
val hundert :Money = Money(100.00, EUR)
val fuenf :Money = Money(5, EUR)
hundert + fuenf
val minusFuenf = Money(-5, EUR)
hundert + minusFuenf
val zehnMio = Money(10000000, EUR)
val nullEuro = Money(curr=USD)
val mixAEDDollar = Money(1.222, AED)
(nullEuro + fuenf + hundert + zehnMio) * -2
val fraction = hundert * 3.14155712987654
fraction.amount
hundert * 3.14152
hundert * -0.8
hundert - minusFuenf
minusFuenf - minusFuenf
minusFuenf.amount
// Defaults per Money-Konstruktor :-)
val defaultMoney = Money()
val defaultUSD = Money(curr=USD)

object UnifiedTypes extends App {
  val set = new mutable.LinkedHashSet[Any]
  set += "This is a string"
  set += 732
  set += 'c'
  set += true
  set += main _     // add a new function
  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {println(iter.next().toString)}
}
UnifiedTypes