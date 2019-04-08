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

// Complete the beautifulBinaryString function below.
fun beautifulBinaryString(b: String): Int {
    var s = b
    var count = 0
    for (i in 0 until s.length - 2) {
        if (s[i] == '0' && s[i+1] == '1' && s[i+2] == '0') {
            s = s.substring(0,i+2)+"1"+s.substring(i+3)
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val b = scan.nextLine()

    val result = beautifulBinaryString(b)

    println(result)
}