
def check(ser:Int=0,num:Int=0): Unit={
  println(ser+" "+num)
}

check(1,5)
check(ser=1) //optional params due to default param value already set
check(num=3) //optional params due to default param value already set

//Note: that default parameters in Scala are not optional when called from Java code


