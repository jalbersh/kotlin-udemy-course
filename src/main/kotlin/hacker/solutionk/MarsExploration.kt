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

// Complete the marsExploration function below.
fun marsExploration(s: String): Int {
    var count=0
    var sent=""
    for (i in 0 until s.length/3) sent+="SOS"
    if (sent.equals(s)) return 0
    var sentLetters = sent.toCharArray()
    var sLetters = s.toCharArray()
    for (i in 0 until s.length) if (sentLetters[i] != sLetters[i]) count++
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = marsExploration(s)

    println(result)
}
