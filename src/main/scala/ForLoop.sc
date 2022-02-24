val digits = Array(10,32,423,54)
var amounts: Array[Int] = Array(31,64,12,90)

for(value <- amounts){
  println(value)
}

for(result <- digits){
  println(result)
}

var sum = 0
for(digit <- digits){
  sum = sum +digit
}
println("sum is : "+ sum)


