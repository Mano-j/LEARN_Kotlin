fun main(args: Array<String>) {
    var fortune = ""

    while(!fortune.startsWith("Take")){
        fortune = getFortuneCookie(getBirthday())

        if(fortune.startsWith("Enter")) {
            println("$fortune \n")
            continue
        }
        println("Your fortune is : $fortune \n")
    }
}

fun getBirthday() :Int{
    println("Enter your Birthday: ")
    return readLine()?.toIntOrNull() ?: -1
}

fun getFortuneCookie(day: Int) : String{
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    return when(day){
            in 1..5 -> fortunes[0]
            in 6..8 -> fortunes[1]
            in 9..14 -> fortunes[2]
            in 15..20 -> fortunes[3]
            in 21..22 -> fortunes[4]
            in 23..25 -> fortunes[5]
            in 25..31 -> fortunes[6]
            else -> "Enter a valid Day."
        }
}

