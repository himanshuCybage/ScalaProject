val values = ("INR",10) //this is Tuple and also represent as Tuple2[String,Int]

println(values._1) //how to access tuple element
println(values._2)

values match {
  case (currency, amount) if currency == "INR" => println("Result Match "+values._2)
}


val planets = List(("Mercury",1),("Venus",2)) //tuples
planets.foreach{
  case ("Mercury", sequence) => println(s"Mercury is $sequence -st planet")
  case _ =>
}



val pairs = List((2,4),(5,6)) //tuple
for((a,b)<- pairs){
println(a*b)
}


