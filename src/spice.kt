class SimpleSpice(var name: String, var spiciness: String = "mild"){
    val heat: Int
        get() = when(spiciness){
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }

    init {
        println("Name: $name Heat: $heat")
    }
}
fun makeSalt() = SimpleSpice(name = "Salt")

fun main(args: Array<String>){

    val curry = SimpleSpice("curry", "mild")
    val pepper = SimpleSpice("Pepper","medium")
    val cayenne = SimpleSpice("Cayenne", "spicy")
    val ginger = SimpleSpice("Ginger", "mild")
    val redCurry = SimpleSpice("Red Curry", "medium")
    val greenCurry = SimpleSpice("Green Curry", "mild")
    val redPepper = SimpleSpice("Red Pepper", "extremely spicy")

    val spices = listOf(curry, pepper, cayenne, ginger, redCurry, greenCurry, redPepper)

    var newList = spices.filter { it.heat > 5 }

    makeSalt()

    //                   --------------- or --------------------

    val spices1 = listOf( SimpleSpice("curry", "mild"),
            SimpleSpice("Pepper","medium"),
            SimpleSpice("Cayenne", "spicy"),
            SimpleSpice("Ginger", "mild"),
            SimpleSpice("Red Curry", "medium"),
            SimpleSpice("Green Curry", "mild"),
            SimpleSpice("Red Pepper", "extremely spicy"))
}