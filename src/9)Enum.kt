
// Enum in Kotlin.


fun main(){

    println("Today is : ${Days.MONDAY}")

    for (day in Days.values()){
        if (day.holiday){
            println(""+day+"is a Holiday!")
        }
    }

}

enum class Days (val holiday : Boolean = false){
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true)
}

enum class Direction{
    NORTH , EAST , WEST , SOUTH
}

enum class Gender{
    MALE , FEMALE , OTHERS
}

