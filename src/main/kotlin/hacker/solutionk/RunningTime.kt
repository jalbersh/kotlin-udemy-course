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

// Complete the runningTime function below.
fun runningTime(arr: Array<Int>): Int {
    var shifts = 0
    for (i in 1 until arr.size) {
        var j = i
        val value = arr[i]
        while (j >= 1 && arr[j - 1] > value) {
            arr[j] = arr[j - 1]
            j--
            shifts++
        }
        arr[j] = value
    }
    return shifts
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = runningTime(arr)

    println(result)
}
