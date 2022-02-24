val values = ("INR",10)

println(values._1)
println(values._2)

values match {
  case (currency, amount) if currency == "INR" => println("Result Match "+values._2)
}