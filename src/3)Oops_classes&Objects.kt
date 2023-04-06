
fun main(){

    /*
    // calling methods of class

    var opClass = Oops()
    println("Class calling with object : ${opClass.kuchBhi}")
    println("Class calling with object : ${opClass.add(2,3)}")
    println("Direct calling : " + Oops().kuchBhi)
    ?
     */

//    var sum = Sum(2 ,4) // while creating object we need to pass the constructor value also.

    println("Calling secondary constructor class : " + Add(4))
    println("Calling secondary constructor class : " + Add(4,5))

}


class Oops {
    var kuchBhi = 34
    fun add(a:Int  , b:Int):Int{
        return a+b
    }
}

// primary constructor
class Sum (val a : Int , val b : Int){
    init {
        println("This init is used for operation in Primary constructor like : ${a + b} " )
    }

    // LOC
}

// primary constructor also represent as
class Sums constructor(val a : Int , val b : Int){
    init {
        println("This init is used for operation in Primary constructor like : ${a + b} " )
    }

    // LOC
}


// secondary constructor
class Add {
    constructor(a:Int){
        println("the value in a is : $a")
    }

    constructor(a:Int , b:Int){
        println("The value passed in a and b during Add class calling is : a = $a and b = $b")
    }

}
