//map, filter etc. are higher order functions

val numbers = Array[Int]() //empty Array

val digits = Array(1,2,34,5,6)

digits.map(n => n*2)
digits.filter(n => n>=20)


val salaries = Seq(20000, 40000, 19000)
val doubleSalary = (x:Int)=>x*2
val newSalary = salaries.map(doubleSalary)
val newSalary1 = salaries.map(x=>x*2) //same result
val newSalary2 = salaries.map(_*2) //same result



