package hacker.solutionk

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

open class Flower {
    open fun whatsYourName(): String {
        return "I have many names and types."
    }
}

internal class Sunflower : Flower() {
    override fun whatsYourName(): String {
        return "Sunflower"
    }
}

internal class Jasmine : Flower() {
    override fun whatsYourName(): String {
        return "Jasmine"
    }
}

internal class Lily : Flower() {
    override fun whatsYourName(): String {
        return "Lily"
    }
}

open class Region {
    open fun yourNationalFlower(): Flower {
        return Flower()
    }
}

internal class Karnataka : Region() {
    override fun yourNationalFlower(): Flower {
        return Sunflower()
    }
}

internal class WestBengal : Region() {
    override fun yourNationalFlower(): Flower {
        return Jasmine()
    }
}

internal class AndhraPradesh : Region() {
    override fun yourNationalFlower(): Flower {
        return Lily()
    }
}

object CovariantDemo {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val reader = BufferedReader(InputStreamReader(System.`in`))
        val s = reader.readLine().trim { it <= ' ' }
        var region: Region? = null
        when (s) {
            "WestBengal" -> region = WestBengal()
            "AndhraPradesh" -> region = AndhraPradesh()
            "Karnataka" -> region = Karnataka()
        }
        val flower = region!!.yourNationalFlower()
        println(flower.whatsYourName())
    }
}