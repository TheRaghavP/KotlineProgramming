
fun main(args: Array<String>){


    var (a , b) = Pair("A" , false)
    println("Pair with value -> $a $b")

    var fullName = Pair("Shivam" , "Patel" )
    println("Pair with var name -> $fullName")
    println("Pair with var postion ->  ${fullName.first}  ${fullName.second}")

    var name = Pair("Shivam" , Pair("Anshu" , Pair("Raghav" ,"Patel")))
    println("Nested Pair -> ${name.first}  ${name.second.first}  ${name.second.second.first}")

     // Triple
    // all the operations are same in triple and aditionaly you have .third in it.
    var (x , y , z) = Triple("shivam" , "patel" , 2003)
    var fullnames = Triple("Nilesh" , "Shivam" , "Patel" )


}


