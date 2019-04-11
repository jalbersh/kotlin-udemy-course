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
import kotlin.streams.toList
import kotlin.text.*

// Complete the separateNumbers function below.
fun getSeparateNumbers(s: String): String {
    for (i in 1..s.length / 2) {
        val num = java.lang.Long.parseLong(s.substring(0, i))
        if (num == 0L) return "NO"
        var index = i
        var flag = true
        var nextNum = num+1
        while (flag && index < s.length) {
            val len = nextNum.toString().length
            val sub = s.substring(index,Math.min(s.length,index+len))
            flag = nextNum == java.lang.Long.parseLong(sub)
            index += len
            nextNum++
        }
        if (flag) return "YES $num"
    }
    return "NO"
}
fun separateNumbers(s: String): Unit {
    println(getSeparateNumbers(s))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        separateNumbers(s)
    }
}
