/* Lambdas -> One line expression!

    ~ It is just a function without name.
    ~ Also known as Anonymous Function.
 */

fun main(){

    println("The square of a=5 is ${Square(5)}")
    println("The square of a=11 is ${square(11)}")
    println("Addition of 5 and 6 is ${add(5,6)}")
    printName("Shivam")
}

// lambda functions

val square : (Int) -> Int = {x -> x*x}

val add : (Int,Int) -> Int = {x,y -> x+y}

val printName = {name : String -> println("Hello, $name") }

 // normal funciton
fun Square(a:Int) : Int {
    return a*a
}