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

// Complete the makingAnagrams function below.
fun makingAnagrams(s1: String, s2: String): Int {
    var count = 0
    val intArr1 = IntArray(26)
    val intArr2 = IntArray(26)
    for (i in 0 until s1.length) {
        intArr1[s1[i].toInt() - 97]++
    }
    for (i in 0 until s2.length) {
        intArr2[s2[i].toInt() - 97]++
    }
    for (i in intArr1.indices) {
        count += Math.abs(intArr1[i]-intArr2[i])
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s1 = scan.nextLine()

    val s2 = scan.nextLine()

    val result = makingAnagrams(s1, s2)

    println(result)
}
