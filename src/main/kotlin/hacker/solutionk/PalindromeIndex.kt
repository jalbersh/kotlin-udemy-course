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
import sun.text.normalizer.UTF16.append
import jdk.nashorn.tools.ShellFunctions.input





// Complete the palindromeIndex function below.
fun isPal(s:String): Boolean {
    return s.reversed().equals(s)
}
fun palindromeIndex(s: String): Int {
    if (isPal(s)) return -1
    for (i in 0 until s.length) {
        val ss = StringBuilder(s)
        if (s[i] !== s[s.length - i - 1]) {
            if (isPal(ss.deleteCharAt(i).toString())) {
                return i
            } else {
                return (s.length - i - 1)
            }
            break
        }
    }
    return -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = palindromeIndex(s)

        println(result)
    }
}
