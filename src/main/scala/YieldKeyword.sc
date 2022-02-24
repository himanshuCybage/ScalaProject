val digits = Array(91,3,5,2)
val result: Unit = for(value <- digits){
   value
}

val result2 = for(value <- digits){
   value
}

val result3: Array[Int] = for(value <- digits) yield{
   value
}

val result4 = for(value <- digits) yield value

