object Factory{
  private var counter = 0
  def create(): Int = {
    counter = counter+1
    counter
  }
}


println(Factory.create())
println(Factory.create())

