def sum(num :Int):Unit ={
  println("Inside sum function\n\n")
  def operation(value : Int):Unit={
   print("Inside operation function")
  }
  operation(num)
}


sum(27)//calling function
