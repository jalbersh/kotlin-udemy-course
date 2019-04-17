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
fun printArray3(arr: Array<Int>): Unit {
    arr.forEach{ print(it.toString()+" ") }
    println()
}
fun insertIntoArray3(value: Int, arr: Array<Int>): Array<Int> {
    var newList = ArrayList<Int>()
    var index=0
    var inserted = false
    for (i in 0 until arr.size) {
        if (value < arr[i] && !inserted) {
            newList.add(value)
            inserted = true
        }
        newList.add(arr[i])
    }
    if (!inserted) newList.add(value)
    return newList.toTypedArray()
}
fun doInsertionSort3(n: Int, arr: Array<Int>): Array<Int> {
        if (n === 1) {
            arr.forEach { print(it) }
            println()
        } else {
            var sorted = arrayOf(arr[0])
            var i = 1
            while (i < arr.size) {
                sorted = insertIntoArray3(arr[i],sorted)
                printArray3(sorted)
                i++
            }
        }
    return arr
}

fun insertionSort3(n: Int, arr: Array<Int>): Unit {
    doInsertionSort3(n,arr)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    insertionSort1(n, arr)
}
