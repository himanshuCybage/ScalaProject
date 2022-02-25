class Practice(topic: String, project: String){
  def welcomeNote(note: String): Unit={
    println(topic+" "+note+" "+project)
  }
}

val obj = new Practice("Scala", "SIQ")
obj.welcomeNote("Welcome")
