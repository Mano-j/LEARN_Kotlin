import java.util.*

fun main(args: Array<String>){
    feedTheFish()
    println(if(shouldChangeWater("Sunday"))"Change the water." else "Don't change the water.")
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day, So feed the fish with $food.")
}

fun randomDay(): String{
    val weekDays = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    val randomIndex = Random().nextInt(7)
    return weekDays[randomIndex]
}

fun fishFood(day: String): String{
    return when(day){
        "Sunday" -> "pellets"
        "Monday" -> "flakes"
        "Tuesday" -> "granules"
        "Thursday" -> "lettuce"
        "Friday" -> "plankton"
        "Saturday" -> "redworms"
        else -> "Nothing"
    }
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean{
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"