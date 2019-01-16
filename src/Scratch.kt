import java.util.*

fun main(args: Array<String>){
    println("Good ${if (args[0].toInt() < 12) "morning" else "night"}, Kotlin. ")

    val rollDice = { sides: Int ->
        if(sides != 0 ) Random().nextInt(sides) + 1
        else 0
    }

    val rollDice1: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

//    println(rollDice(2))
//    println(rollDice1(4))
    gamePlay(rollDice1(6))
    gamePlay(rollDice1(6))
    gamePlay(rollDice1(6))
}

fun gamePlay(operation: Int){
    println(operation)
}