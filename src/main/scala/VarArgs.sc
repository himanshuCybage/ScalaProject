def sum(inputs : Int*):Unit={
   for(num <- inputs){
     println(num)
   }
}

sum(19,2)
sum(9)
sum(2,4,3,1)