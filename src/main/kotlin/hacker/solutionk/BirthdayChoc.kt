package hacker.solutionk

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var count=0
    if (m == 1) {
        if (s.contains(d)) {
            count = s.count { it == d }
        }
    } else {
        for (i in 0..s.size - m) {
            if (s.sliceArray(i..i + m - 1).sum() == d) count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
