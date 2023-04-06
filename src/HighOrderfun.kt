/*
    #High Order Functions

    ~ A function which can accepts a function as parameter or can return a function is called Higher-Order function.

    ~ Kotlin functions can be stored in variables and data structures, passed as arguments to and
        returned from other higher-order functions.
 */

fun main() {

    highOrder(printMe)
    highAdd(AddFunc)
    highAddWithReturn(AddFunc)
}

val printMe = { println("This line has been printed!")}

val AddFunc = {a:Int,b:Int -> a+b}

val retFunc = {a:Int ,b:Int -> "The sum is: ${a+b}"}

fun highOrder( func: ()-> Unit){
    func()
}

fun highAdd(addFunc: (Int , Int) -> Int){
    println("The sum is ${addFunc(4, 5)}")
}


fun highAddWithReturn(addFunc: (Int, Int) -> Int) : (Int, Int) -> String{
    println("The sum is ${addFunc(4, 5)}")

    return retFunc
}


class HighClass(func: () -> Unit){

}