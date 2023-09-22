// Superclass
open class MyParentClass {
  val x = 5
  var name = "modocm"
}

// Subclass
class MyChildClass: MyParentClass() {
  fun myFunction() {
    println(x) 
   
  }
}
fun main(args: Array<String>) {
    val child = MyChildClass()
    child.myFunction()


    val names = MyParentClass()
    names.name
    println( names.name)
}