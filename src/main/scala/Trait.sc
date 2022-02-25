
trait Demo{ // trait is equivalent to interface in java
   def operation(value: Int):Unit
}

class Example extends Demo{
   override def operation(value: Int):Unit={
      println("Overriden method called with input :"+value)


   }
}

val obj = new Example()
obj.operation(10)
