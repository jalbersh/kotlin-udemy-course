package hacker.solutionk

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the squares function below.
fun squares(a: Int, b: Int): Int {
    var count=0
    var i=a
    while (i <= b) {
        var sqr: Int = Math.sqrt(i.toDouble()).toInt()
        if (sqr*sqr == i) {
            count++
            i += sqr*2
        }
        else i++
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val ab = scan.nextLine().split(" ")

        val a = ab[0].trim().toInt()

        val b = ab[1].trim().toInt()

        val result = squares(a, b)

        println(result)
    }
}
