fun main(args: Array<String>){
    println(whatShouldIDoToday(getMood()))
}

fun getMood(): String{
    println("How are you feeling today?")
    return readLine()!!
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String{
    return when{
        isHappySunny(mood, weather) -> "Go for a walk."
        isSadSunny(mood, weather) -> "Listen to a good music."
        isSadRainy(mood, weather, temperature) -> "Stay in bed."
        isHappyRainy(mood, weather) -> "Make yourself a coffee."
        isBoredCloudy(mood, weather) -> "Read a book."
        isVeryHot(temperature)-> "Go swimming."
        else -> "Do nothing."
    }
}

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isSadSunny(mood: String, weather: String) = mood == "sad" && weather == "sunny"
fun isSadRainy(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature < 10
fun isHappyRainy(mood: String, weather: String) = mood == "happy" && weather == "rainy"
fun isBoredCloudy(mood: String, weather: String) = mood == "bored" && weather == "cloudy"
fun isVeryHot(temperature: Int) = temperature > 35

