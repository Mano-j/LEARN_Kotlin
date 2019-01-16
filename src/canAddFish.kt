fun main (args: Array<String>){
    println(canAddFish(10.0, listOf(3,3,3)).toString())
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false).toString())
    println(canAddFish(9.0, listOf(1,1,3), 3).toString())
    println(canAddFish(10.0, listOf(), 7, true).toString())
}

fun canAddFish(tankSize: Double, currentFish : List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true ): Boolean{

    var availableSize = tankSize

    if (hasDecorations) availableSize = tankSize - (tankSize*20).div(100)

    return (availableSize >= currentFish.sum().plus(fishSize))

}