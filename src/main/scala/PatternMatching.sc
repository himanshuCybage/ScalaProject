import scala.util.Random

var num = 294
var digit = 30
var amount = 98

num match{
  case 29 => println("1.num Match found for 29")
  case 30 => println("2.num Match Found for 30")
  case _ => println("Nothing match in num hence default statement")
}

digit match {
  case 29 => println("3.digit Match Found for 29")
  case 30 => println("4.digit Match Found for 30")
  case _ => println("Nothing match in digit hence default statement")
}

amount match{
  case x if amount>50 => println("amount is :"+x)
  case _ => println("Nothing match in amount")
}

var result: Unit = amount match{
  case x if amount>50 => println("amount is :"+x)
  case _ => println("Nothing match in amount")
}

var result: String  = amount match{
  case x if amount>50 => "amount is :"+x
  case _ => "Nothing match in amount"
}


val value:Int = Random.nextInt(6)

value match{
  case 0=> "Zero"
  case 1=> "One"
  case 2=> "Two"
  case 3=> "Three"
  case _=> "Other"

}








