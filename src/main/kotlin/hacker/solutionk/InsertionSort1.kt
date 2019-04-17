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

// Complete the insertionSort1 function below.
fun printArray(arr: Array<Int>): Unit {
    arr.forEach{ print(it.toString()+" ") }
    println()
}
fun doInsertionSort1(n: Int, arr: Array<Int>): Array<Int> {
    if (n === 1) {
        arr.forEach{ print(it) }
        println()
    } else {
        val value = arr[n - 1]
        var i = n - 2
        while (i <= arr.size) {
            if (i == -1) {
                arr[0] = value
                printArray(arr)
                break
            }
            if (arr[i] > value) {
                arr[i + 1] = arr[i]
                printArray(arr)
            } else {
                arr[i + 1] = value
                printArray(arr)
                break
            }
            i--
        }
    }
    return arr
}

fun insertionSort1(n: Int, arr: Array<Int>): Unit {
    doInsertionSort1(n,arr)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    insertionSort1(n, arr)
}
