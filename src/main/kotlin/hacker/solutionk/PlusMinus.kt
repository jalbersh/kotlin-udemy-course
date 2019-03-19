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

// Complete the plusMinus function below.
fun getNegativeFraction(arr: Array<Int>): Double {
    var count=0;
    for (i in arr) {
        if (i<0) count++;
    }
    return (count.toDouble()/arr.size.toDouble())
}
fun getPositiveFraction(arr: Array<Int>): Double {
    var count=0;
    for (i in arr) {
        if (i>0) count++;
    }
    return (count.toDouble()/arr.size.toDouble())
}
fun getZeroFraction(arr: Array<Int>): Double {
    var count=0;
    for (i in arr) {
        if (i==0) count++;
    }
    return (count.toDouble()/arr.size.toDouble())
}
fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)
fun plusMinus(arr: Array<Int>): Unit {
    var neg = getNegativeFraction(arr)
    var pos = getPositiveFraction(arr)
    var zer = getZeroFraction(arr)
    var s = "${pos.format(6)}"
    println(s)
    s = "${neg.format(6)}"
    println(s)
    s = "${zer.format(6)}"
    println(s)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
