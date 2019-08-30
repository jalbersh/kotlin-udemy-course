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

// Complete the alternate function below.
fun alternate(s: String): Int {
    val sa = s.toCharArray()
    val unique = s.chars().distinct().toArray()
    var maxLength = 0
    for (i in 0 until unique.size - 1) {
        val c1 = unique[i].toChar()
        for (j in i + 1 until unique.size) {
            val c2 = unique[j].toChar()
            var length = 0
            var valid = true
            var isAlternating = 0
            for (k in sa.indices) {
                if (sa[k] == c1) {
                    isAlternating++
                    length++
                } else if (sa[k] == c2) {
                    isAlternating--
                    length++
                }
                if (isAlternating > 1 || isAlternating < 0) {
                    valid = false
                    break
                }
            }
            if (valid) {
                if (length > maxLength) {
                    maxLength = length
                }
            }
        }
    }
    return maxLength
}

fun main(args: Array<String>) {
    val l = readLine()!!.trim().toInt()

    val s = readLine()!!

    val result = alternate(s)

    println(result)
}
