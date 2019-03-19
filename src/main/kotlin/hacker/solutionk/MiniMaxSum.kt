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

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<BigInteger>): Unit {
    var minSum:BigInteger = BigInteger.ZERO
    var maxSum:BigInteger = BigInteger.ZERO
    Arrays.sort(arr)
    for (i in 0 until 4)  {
        minSum += arr[i]
        maxSum += arr[i+1]
    }
    println("$minSum $maxSum")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toBigInteger() }.toTypedArray()

    miniMaxSum(arr)
}
