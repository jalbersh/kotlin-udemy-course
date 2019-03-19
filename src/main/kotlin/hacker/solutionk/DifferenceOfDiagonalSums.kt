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

// Complete the diagonalDifference function below.
fun diagonalSumULtoLR(arr: Array<Array<Int>>): Int {
    var sum = 0;
    for (i in 0 until arr.size) {
        for (j in 0 until arr[i].size) {
            if (i == j) sum += arr[i][j]
        }
    }
    return sum
}
fun diagonalSumURtoLL(arr: Array<Array<Int>>): Int {
    var sum = 0;
    for (i in 0 until arr.size) {
        for (j in 0 until arr[i].size) {
            if (i+j == arr.size-1) {
                sum += arr[i][j]
            }
        }
    }
    return sum
}
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    return Math.abs(diagonalSumULtoLR(arr)-diagonalSumURtoLL(arr))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
