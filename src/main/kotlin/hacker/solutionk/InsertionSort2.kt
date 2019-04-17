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
fun printArray2(arr: Array<Int>): Unit {
    arr.forEach{ print(it.toString()+" ") }
    println()
}
fun doInsertionSort2(n: Int, arr: Array<Int>): Array<Int> {
    for (i in 1 until arr.size) {
        val value = arr[i]
        for (j in i - 1 downTo 0) {
            if (value < arr[j])
                arr[j + 1] = arr[j]
            else if (arr[j] <= value) {
                arr[j + 1] = value
                break
            }
            if (j == 0 && value < arr[0])
                arr[0] = value
        }
        printArray2(arr)
    }
    return arr
}

fun insertionSort2(n: Int, arr: Array<Int>): Unit {
    doInsertionSort2(n, arr)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    insertionSort2(n, arr)
}
