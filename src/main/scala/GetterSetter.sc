class Demo{
  private var _id = 0 //by default any var or val is Public
  private var _nameId = 0

  def id_=(value: Int):Unit = { //setter method syntax
    _id = value
  }

  def id = _id //getter method syntax

  def nameId_=(value: Int):Unit = { //setter
    _nameId=value
  }

  def nameId = _nameId //getter

}
val obj = new Demo
obj.id=19 //setting value
obj.nameId=20
println(obj.id) //calling getter
print(obj.nameId)



