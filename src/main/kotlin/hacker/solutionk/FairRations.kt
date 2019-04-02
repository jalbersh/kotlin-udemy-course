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

// Complete the fairRations function below.
fun fairRations(B: Array<Int>): String {
    var cnt = 0
    for (i in 0 until B.size-1) {
        if (B[i] % 2 != 0) {
            B[i]++
            B[i+1]++
            cnt += 2
        }
    }
    var sum = B.reduce{k,v -> k+v}
    if (sum % 2 != 0) return "NO" else return cnt.toString()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()

    val B = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = fairRations(B)

    println(result)
}
