val currencies = Array("INR","USD","EURO")
val priceList = Array(23,53,76)

val result: Array[String] = for{
  currency <- currencies
  price <- priceList
  if price > 50
} yield {currency+" "+price}

