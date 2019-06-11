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
fun printArray(arr: ArrayList<Int>): Unit {
    var iterator = arr.iterator()
    while (iterator.hasNext()) { var it = iterator.next(); print(it.toString()+" ") }
    println()
}
fun countingSort(arr: Array<Int>): Array<Int> {
    var res = Array<Int>(100, { i -> 0 } )
    val a = ArrayList<Int>()
    for (j in 0 until arr.size)
        a.add(Integer.valueOf(arr[j]))
    for (w in 0..99) {
        res[w] = Collections.frequency(a, w)
    }
    printArray(a)
    return res
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = countingSort(arr)

    println(result.joinToString(" "))
}
