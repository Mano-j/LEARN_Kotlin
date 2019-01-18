package Aquarium

import kotlin.math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40){
    open var volume: Int
        get() = length * width * height / 1000     // .div(1000) since, cm^3 to litre
        set(value){ height = (value * 1000) / (length * width) }
    open var water = volume * 0.9

    constructor(numberOfFish: Int): this(){
        val walter = numberOfFish * 2000    // in cm^3
        val tank = water + water * 0.1
        height = (tank / (width * length)).toInt()
    }
}

class TowerTank(): Aquarium(){

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }

    override  var water = volume * 0.8
}