def square(x:Int):Int ={ //function
  return x*x
}

def sum(x:Int, y:Int):Int ={ //function
  x+y
}

def multiply(x:Int, y: Int):Int = x*y //function

square(2)// calling function
sum(3,6)
multiply(7,5)


def getStringValue(num: Int):String = {
  val square = num * num
  square.toString
}
println(getStringValue(20))


