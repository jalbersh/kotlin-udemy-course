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

// Complete the superReducedString function below.
fun superReducedString(s: String): String {
    var i = 1
    var str = s
    while (i < str.length) {
        if (str[i] == str[i - 1]) {
            str = StringBuilder(str).deleteCharAt(i).deleteCharAt(i-1).toString()
            i = 0
        }
        i++
    }
    return if (str.isEmpty()) "Empty String" else str
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = superReducedString(s)

    println(result)
}
