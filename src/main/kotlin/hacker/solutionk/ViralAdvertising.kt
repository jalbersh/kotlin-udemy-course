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
import kotlin.math.floor
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the viralAdvertising function below.
fun viralAdvertising(n: Int): Int {
    var count=2
    var shared=5
    for (i in 2..n) {
        shared = floor(shared.toDouble() / 2).toInt()*3
        count += floor(shared.toDouble()/2).toInt()
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}