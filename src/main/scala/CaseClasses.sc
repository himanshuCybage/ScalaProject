case class Study(languageName: String)

val obj1 = Study("Scala") //we can instantiate case class without new keyword
val obj2 = Study("Java")
val obj3 = Study("Scala")

if(obj1 == obj3){
  println("Obj1 and Obj2 are same")
}else{
  println("Obj1 and Obj2 are not same")
}