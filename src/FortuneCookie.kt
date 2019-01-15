fun main(args: Array<String>) {
    for(counter in 1..10) {
        val fortune = getFortuneCookie()
        println("Your fortune is : $fortune \n")

        // Loops for 10 times or until the fortune is "Take it easy and enjoy life!".
        if(fortune.startsWith("Take")) break
    }
}
fun getFortuneCookie() : String{
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

        println("Enter your Birthday: ")
        val birthday = readLine()!!.toIntOrNull()
        val index = birthday?.rem(fortunes.size) ?: -1

        // Notice return statement can be lifted out of if..else/when. Since if..else/when can be used as expressions in Kotlin.
        return if(index != -1) fortunes[index] else "\"Enter a valid Day\""
}