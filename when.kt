// fun main(args: Array<String>) {
//     var a = 2

//     when{
//         a<10 -> println("$a is less than 10")
//         a==10 -> println("$a is equals to 10")
//         a>10 -> println("$a is greater than 10")
//         else ->{
//             println("invalid")
//         }
//     } 
// }

// fun main(args: Array<String>) {
//     var marks:Int = 90 //we set some marks here
//     when(marks){
//     in 1..30 -> println("You have $marks - Below average")
//     in 31..50 -> println("You have $marks - Average")
//     in 51..75 -> println("You have $marks - Above average")
//     in 76..99 -> println("You have $marks - Excellent")
//     else -> println("You have $marks - Invalid Marks try again")
//     }
//     }


fun main(args: Array<String>) {
    var amount:Int = 100000

    when(amount){

    in 1..5999 -> println("monthly contribution 150.00")
    in 6000..7999   -> println("monthly contribution 300.00")
    in 8000..11999  -> println("monthly contribution 400.00")
    in 12000..14999 -> println("monthly contribution 500.00")
    in 15000..19999 -> println("monthly contribution 600.00")
    in 20000..24999 -> println("monthly contribution 750.00")
    in 25000..29999 -> println("monthly contribution 850.00")
    in 30000..49999 -> println("monthly contribution 1,000.00")
    in 50000..99999 -> println("monthly contribution 1500.00")
    
if (amount >=100000){
    2000
}
else{
    println ("invalid entry")
}
   
}
}

















