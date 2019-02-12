package oo

abstract class Course(val topic:String, val price:Double) {
    open fun learn(){
        println("Learning a $topic course")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

open class Kotlin() : Course("Kotlin", 999.99){
    // add final in front of fun to prevent overriding
    override /* final */fun learn() {
        println("i'm learning Kotlin")
    }
}

class SpecialKotlin() : Kotlin(), Learnable {
    override fun learn() {
        super<Learnable>.learn()
        println("I'm getting a 90% discount on Kotlin")
    }
}

fun main(args: Array<String>) {
    val kotlin = Kotlin()
    kotlin.learn()
    val special = SpecialKotlin()
    special.learn()
}
