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
import java.util.Arrays



// Complete the beautifulTriplets function below.
fun beautifulTriplets(d: Int, arr: Array<Int>): Int {
    var count = 0
    for (i in 0 until arr.size) {
        val n = arr[i]
        if (Arrays.stream<Any>(arr).anyMatch { it -> it == n+d } && Arrays.stream<Any>(arr).anyMatch { it -> it == n+2*d }) {
            count += 1
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = beautifulTriplets(d, arr)

    println(result)
}
