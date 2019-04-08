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

// Complete the funnyString function below.
fun funnyString(s: String): String {
    for (i in 1..s.length / 2) {
        var diff1 = 0
        var diff2 = 0
        diff1 = Math.abs(s[i].toInt() - s[i - 1].toInt())
        diff2 = Math.abs(s[s.length - i].toInt() - s[s.length - 1 - i].toInt())
        if (diff1 != diff2) return "Not Funny"
    }
    return "Funny"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = funnyString(s)

        println(result)
    }
}
/*
 */