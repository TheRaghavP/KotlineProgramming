
/*In some languages like java , we use static keyword to declare the members
of the class and use them without making any object i.e., just call them with
the help of class name.

There is nothing called static in Kotlin. So, in Kotlin , we use a companion object.

 */

fun main(){

    val cc = CompanionClass()

    // we are calling normal objects using class object.
    println("first Number : ${cc.fistNum} ")
    println("Function calling : ${cc.Add(1,2)} ")

    // but for calling companion objects we only give class reference .
    println("Api key : ${CompanionClass.apiKey}")
    print("Product function : ${CompanionClass.Product(1,2)}")

}

class CompanionClass{

    var fistNum = 10

    fun Add(a:Int , b:Int):Int{
        return a+b
    }

    // instead of "static" in kotlin we use "companion object" and all the static object written into it.
    companion object{
        var apiKey = "key252525"
        fun Product(a:Int , b:Int):Int{
            return a*b
        }
    }


}