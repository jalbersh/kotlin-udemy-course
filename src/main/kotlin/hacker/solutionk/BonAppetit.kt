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

// Complete the bonAppetit function below.
fun calcOwed(bill: Array<Int>, k: Int, b: Int): Int {
    var total = bill.reduce{ acc, it -> acc + it }
    var annas = (total - bill[k]) / 2;
    var refundOrOwed = b-annas
    return refundOrOwed
}
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val refundOrOwed = calcOwed(bill,k,b)
    if (refundOrOwed==0) println("Bon Appetit")
    else println(refundOrOwed.toString())
}
fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
