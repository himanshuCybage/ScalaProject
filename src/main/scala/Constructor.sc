class User
val userObj = new User // object with no arg constructor
val userObj2 = new User()  //same as above

class Consumer(var seq:Int, var name:String){
  override def toString: String = s"($seq, $name)"

}
val consume = new Consumer(1,"Himanshu")
println(consume.seq)
println(consume.name)
consume.toString


class OptionalParam(var num:Int=0, var name: String="Blank"){ //arguments set with default value
  override def toString: String = s"$num, $name"
}

val objOptional = new OptionalParam(num = 2)
val objOptional2 = new OptionalParam(5,"HK")
objOptional.toString
objOptional2.toString






