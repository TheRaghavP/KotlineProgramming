
fun main(){

//    val genClass = GenClass<String>("Raghav") -> " You can also define the type in <> "
    val genClass = GenClass("Shivam")

}

class GenClass<T>(value : T){

    init {
        println("The value is: $value")

        Check<T>(value)
    }

}

fun <T> Check( text:T ){
    println("Received value is: $text")
}





/*
    #Generics
    ~ Generic is defined as a product without a brand.
    ~ Generics are the powerful features that allow us to define classes, methods and properties.
    ~ Which are the accessible using different data type while keeping a check of the compile-time type safety.
    ~ A generic type is a class or method that is parameterized over types.
    ~ We always use angle brackets () to specify the type parameter in the program.

    #Advantages of Generics
    ~Type casting is evitable-No need to typecast the object.
    ~Type safety-Generic allows only single type of object at a time.
    ~Compile time safety-Generic code is checked at compile time for the
      parameterized type so that it avoids run time error.

 */
