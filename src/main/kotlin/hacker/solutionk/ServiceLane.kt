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
import java.util.TreeSet
import java.util.Arrays





// Complete the serviceLane function below.
fun serviceLane(n: Int, cases: Array<Array<Int>>, width: Array<Int>): Array<Int> {
    val resultList = arrayOf(cases.size)
    var laps: Int = 0
    var minimum = Integer.MAX_VALUE

    for (i in 0 until cases.size) {
        minimum = Integer.MAX_VALUE
        for (k in 0 until width.size) {
            if (k >= cases[i][0] && k <= cases[i][1] && width[k] < minimum) {
                minimum = width[k]
            }
        }
        resultList[laps] = minimum
        laps++
    }
    return resultList
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nt = scan.nextLine().split(" ")

    val n = nt[0].trim().toInt()

    val t = nt[1].trim().toInt()

    val width = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val cases = Array<Array<Int>>(t, { Array<Int>(2, { 0 }) })

    for (i in 0 until t) {
        cases[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = serviceLane(n, cases, width)

    println(result.joinToString("\n"))
}
