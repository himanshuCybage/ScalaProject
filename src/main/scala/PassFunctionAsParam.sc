def sum(n : Int):Int = n+n//Int => Int
def square(n : Int):Int = n*n//Int => Int
def name(n: String): String = n//String => String

def transform(f:Int => Int , number: Int): Int = number-2

def transformName(f: String=> String, nameValue: String): String=nameValue



transform(sum, 5)
transformName(name,"Himanshu")



