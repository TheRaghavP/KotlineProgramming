fun main(args: Array<String>){

    println("Hello World !")

    var a = 23 // var is a mutable datatype
    a = 80
    println("variable a contains $a")

    val b = 34 // val is a immutable datatype
//    b = 34
    println("variable b contains $b")

    // note :- by default all the functions in kotlin are public & final. and protected is not exist in kotlin
    // for accessing class we need to use "open" in the begning



    // condition statements
    /* if(){}
        if(){} else{}
        if(){}  elseif(){} else{}
     */

    // iterators
    var num = 8
    var msg = if(num < 10) "Number is less than 10" else "Number is grater than 10"
    println(msg)


    // loops

    // for loop
    /*
    var count : Int = 0
    for (i in 0..5){
        println("Number is : ${count++}")
    } // output of this loop is 0 to 5

    for (i in 0 until 5){
        println("Number is : ${count++}")
    } // output of this loop is 0 to 4

    for (i in 10 downTo 0){
        println("$i -> ${count++}")
    } // output -> 0 to 10

    for (i in 0..10 step 2){
        println("$i -> ${count++}")
    }

    */

}


// functions in kotlin

fun add(){  // void return type
    println("Hey this is void function")
}

fun sub( a:Int , b:Int): Int{ // specific return type
    return a - b
}

fun product(a:Int , b:Int) : Any{ // when you don't know about return type you can use "Any" for this.
    return a*b
}


