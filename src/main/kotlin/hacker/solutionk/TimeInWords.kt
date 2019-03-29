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

// Complete the timeInWords function below.
fun timeInWords(h: Int, m: Int): String {
    var time = "";
    var hour = ""
    var minute = ""
    var nextHour = 0
    if (m>30) {
        nextHour = h+1
        if (nextHour == 13) nextHour=1
    } else nextHour = h
    when(nextHour) {
        1 -> hour = "one"
        2 -> hour = "two"
        3 -> hour = "three"
        4 -> hour = "four"
        5 -> hour = "five"
        6 -> hour = "six"
        7 -> hour = "seven"
        8 -> hour = "eight"
        9 -> hour = "nine"
        10 -> hour = "ten"
        11 -> hour = "eleven"
        12 -> hour = "twelve"
    }
    when(m) {
        0 -> minute = "o' clock"
        1 -> minute = "one minute past"
        2 -> minute = "two minutes past"
        3 -> minute = "three minutes past"
        4 -> minute = "four minutes past"
        5 -> minute = "five minutes past"
        6 -> minute = "six minutes past"
        7 -> minute = "seven minutes past"
        8 -> minute = "eight minutes past"
        9 -> minute = "nine minutes past"
        10 -> minute = "ten minutes past"
        11 -> minute = "eleven minutes past"
        12 -> minute = "twelve minutes past"
        13 -> minute = "thirteen minutes past"
        14 -> minute = "fourteen minutes past"
        15 -> minute = "quarter past"
        16 -> minute = "sixteen minutes past"
        17 -> minute = "seventeen minutes past"
        18 -> minute = "eighteen minutes past"
        19 -> minute = "nineteen minutes past"
        20 -> minute = "twenty minutes past"
        21 -> minute = "twenty one minutes past"
        22 -> minute = "twenty two minutes past"
        23 -> minute = "twenty three minutes past"
        24 -> minute = "twnety four minutes past"
        25 -> minute = "twenty five minutes past"
        26 -> minute = "twenty six minutes past"
        27 -> minute = "twenty seven minutes past"
        28 -> minute = "twenty eight minutes past"
        29 -> minute = "twenty nine minutes past"
        30 -> minute = "half past"
        31 -> minute = "twenty nine minutes to"
        32 -> minute = "twenty eight minutes to"
        33 -> minute = "twenty seven minutes to"
        34 -> minute = "twenty six minutes to"
        35 -> minute = "twenty five minutes to"
        36 -> minute = "twenty four minutes to"
        37 -> minute = "twenty three minutes to"
        38 -> minute = "twenty two minutes to"
        39 -> minute = "twnety one minutes to"
        40 -> minute = "twenty minutes to"
        41 -> minute = "nineteen minutes to"
        42 -> minute = "eighteen minutes to"
        43 -> minute = "seventeen minutes to"
        44 -> minute = "sixteen minutes to"
        45 -> minute = "quarter to"
        46 -> minute = "fourteen minutes to"
        47 -> minute = "thirteen minutes to"
        48 -> minute = "twelve minutes to"
        49 -> minute = "eleven minutes to"
        50 -> minute = "ten minutes to"
        51 -> minute = "nine minutes to"
        52 -> minute = "eight minutes to"
        53 -> minute = "seven minutes to"
        54 -> minute = "six minutes to"
        55 -> minute = "five minutes to"
        56 -> minute = "four minutes to"
        57 -> minute = "three minutes to"
        58 -> minute = "two minutes to"
        59 -> minute = "one minute to"
    }
    if (m==0) time = hour + " " + minute
    else time = minute + " " + hour
    return time
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().trim().toInt()

    val m = scan.nextLine().trim().toInt()

    val result = timeInWords(h, m)

    println(result)
}
