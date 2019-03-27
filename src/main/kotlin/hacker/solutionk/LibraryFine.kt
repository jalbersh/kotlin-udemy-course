package hacker.solutionk

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.time.LocalDate
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

// Complete the libraryFine function below.
fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    val returned = LocalDate.of(y1, m1, d1)
    val due = LocalDate.of(y2,m2,d2)
    if (due > returned) return 0
//    returned.minus(due.)
    // same month = 15*#days
    if (y1 == y2 && m1 == m2) return (d1-d2)*15
    // same year = 500*#months
    else if (y1 == y2) return (m1-m2)*500
    // diff year = 10000
    else return 10000
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val d1M1Y1 = scan.nextLine().split(" ")

    val d1 = d1M1Y1[0].trim().toInt()

    val m1 = d1M1Y1[1].trim().toInt()

    val y1 = d1M1Y1[2].trim().toInt()

    val d2M2Y2 = scan.nextLine().split(" ")

    val d2 = d2M2Y2[0].trim().toInt()

    val m2 = d2M2Y2[1].trim().toInt()

    val y2 = d2M2Y2[2].trim().toInt()

    val result = libraryFine(d1, m1, y1, d2, m2, y2)

    println(result)
}
