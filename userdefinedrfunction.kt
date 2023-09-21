fun main(args: Array<String>) {
 callme()
 addnumber()
 area()
 check()
add_numbers(12.0,31.5)
si(6000.0, 35.0, 10.0)
check(43.0,4589)
check(74.0,3769)
check(78.3,6789)
BMI(70, 1.95)
BMI(80, 2.34)
}




fun callme(){
    println("hello student")
}


fun addnumber(){
    var num1:Int= 16
    var num2:Int=56
    var sum = num1+ num2 
    println("the sum $sum")
}


fun area(){
    var H:Int= 8
    var b:Int=6
    var area = 0.5*b*H
    println("the area $area")
}


fun check(){
    val number = 12 
    if (number<0){
        println("negative number")
    }else if (number>0){
        println("postive number")
    }else{
        println("its invalid")

    }
}
    // functions with parameters


 fun add_numbers(number1:Double,number2:Double){
    val answer = number1 + number2
     println("the sum $answer")
    
    }


    fun si(principal:Double,rate:Double,time:Double){
        val si= principal*rate/100*time
        println("$si")
    }

// check marks 
fun check (marks:Double,Admno:Int){

if(marks<30 ){
    println(" yourAdm No is $Admno,you Failed")
}else 
     if (marks >=30 && marks<75){
        println("yourAdm No is $Admno , you are average")
        print("you've scored $marks")
     } else 
     if (marks >=75&& marks<100){
        println("yourAdm No is $Admno , Exellent")
        print("you've scored $marks")
     }else
       println("your Adm No is $Admno, enter invalid marks")


}
//   body mass
fun  BMI(w:Int,h:Double){
    val BMI= w/(h*h)
    println("YOUR BMI $BMI")
}





















