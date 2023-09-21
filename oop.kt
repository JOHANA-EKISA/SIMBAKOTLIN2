class triangle{
    private var base: Double = 2.4
    private var height: Double = 5.4

     fun area (){
        var area = 0.5*(base*height)
        println("the area of the trisngle :  $area")
     }
}
fun main(args: Array<String>) {
    // we create an object using val 
    // we initialize it to triangle 
    // create object of a trianlge class

    val triangle_object =triangle()
    // using the created object we call findArea()fuction 
    triangle_object .area()

    val gross_income= PayRoll()
    gross_income .findGross()
    
    val Health_BMI= Health()
    Health_BMI.findBMI()
}





class PayRoll{
private var basic : Double = 24000.0 
private var allowance : Double =2000.0
private var tax : Double = 3444.4
private var name :String ="Hassan"



fun findGross() {


    val gross_income : Double= (basic + allowance) - tax 
    println ("your name :"+name)
    println("gross pay is :$gross_income  ")
    
}




}





class Health(){

private var W : Int =70
private var H : Double = 2.73


    fun findBMI(){

    val Health = W/(H*H)
    println("your bmi is $Health")

}
 }










































