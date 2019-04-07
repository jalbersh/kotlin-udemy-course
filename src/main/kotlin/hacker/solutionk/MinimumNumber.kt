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

// Complete the minimumNumber function below.
fun minimumNumber(n: Int, password: String): Int {
    var count=0
    val digit = Pattern.compile("(\\d)")
    val upper = Pattern.compile("([A-Z])")
    val lower = Pattern.compile("([a-z])")
    val special = Pattern.compile("(\\W)")
    val matcherDigit = digit.matcher(password)
    val matcherUpper = upper.matcher(password)
    val matcherLower = lower.matcher(password)
    val matcherSpecial = special.matcher(password)
    if (!matcherDigit.find()) count++
    if (!matcherUpper.find()) count++
    if (!matcherLower.find()) count++
    if (!matcherSpecial.find()) count++
    return Math.max(count,6-n)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val password = scan.nextLine()

    val answer = minimumNumber(n, password)

    println(answer)
}
