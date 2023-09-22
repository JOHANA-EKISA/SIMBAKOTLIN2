class Cars(var brand: String, var model: String, var year: Int){
// FUNCTION
fun drive() = {
  println("wroom!")
}
 // Class function with parameters
 fun speed(maxSpeed: Int) {
  println("Max speed is: " + maxSpeed)
}

}


// COSTRUCTOR

fun main(args: Array<String>) {
  val c1 = Cars("bmx", "x5", 2000)
  val c2 =Cars("ford", "mustang", 1567)
  val c3=Cars("tesla", "model S", 1567)

  println(c1.brand)
  println(c2.brand)
  println(c3.brand)

  println(c1.year)
  println(c2.year)
  println(c3.year)

  println(c1.model)
  println(c2.model)
  println(c3.model)





   // Print property values
   println(c1.brand + " " + c1.model + " " + c1.year)
  
   // Call the function
   c1.drive() 
   c1.speed(180) 
}