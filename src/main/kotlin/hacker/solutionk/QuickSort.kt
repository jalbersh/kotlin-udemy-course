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
import java.util.stream.IntStream

// Complete the quickSort function below.
fun quickSort(ar: Array<Int>): Array<Int> {
    val piv = ar[0]
    var j: Int
    var t: Int
    var i: Int
    var k = 0
    i = 1
    while (i < ar.size) {
        if (ar[i] < piv) {
            t = ar[i]
            j = i - 1
            while (j >= k) {
                ar[j + 1] = ar[j]
                j--
            }
            ar[k] = t
            k++
        }
        i++
    }
    return ar
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = quickSort(arr)

    println(result.joinToString(" "))
}