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

// Complete the countingValleys function below.
fun changeLevel(level: Int, up: Boolean): Int {
    if (level == -1 && up) return 1
    else return 0
}
fun countingValleys(n: Int, s: String): Int {
    var count=0
    var level=0
    for (i in s.toCharArray()) {
        if (i == 'U') {
            count += changeLevel(level,true)
            level++
        }
        else if (i == 'D') {
            count += changeLevel(level, false)
            level--
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
