
/* Inheritance

    ~Subclass can reuse methods and fields of the Parent class.
    ~By default , Kotlin classes are final - they can't be inherited.
     To make a class inheritable, mark it with the open keyword.

 */
fun main(){

    var classA = ClassA()
    var classB = ClassB()

    println("The Name is " + classA.name + ", " + classB.name)
    println("The Sum and square of sum is " + classA.Add(5,6) + ", " + classB.Add(5,6))

}

open class ClassA {

    open var name = "Shivam"

    open fun Add(a:Int , b:Int):Int{
        return a+b
    }

}

/* ~In java, we use extend. but in Kotlin we use " : " .
    and we use "open" in parent class.

   ~ for changing the definition of object we use "Method Overriding" concept.
     through with we can change the definition in run time.
 */

class ClassB : ClassA() {

    override var name : String = "Nilesh"

    override fun Add( a:Int , b:Int) :Int {
        val sum = super.Add(a, b)
        val sqr = sum*sum
        return sqr
    }

}







