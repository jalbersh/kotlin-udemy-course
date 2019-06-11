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
import java.util.Collections.frequency
import java.util.ArrayList



// Complete the countingSort function below.

fun countingSort2(arr: Array<Int>): Array<Int> {
    val temp = IntArray(100)
    for (i in 0 until arr.size) {
        temp[arr[i]] = temp[arr[i]] + 1
    }
    var c = 0
    for (i in temp.indices) {
        for (k in 0 until temp[i]) {
            arr[c++] = i
        }
    }
    printArray(arr)
    return arr
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = countingSort2(arr)

    println(result.joinToString(" "))
}
