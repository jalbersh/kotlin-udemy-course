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

// Complete the gemstones function below.
fun gemstones(arr: Array<String>): Int {
    var set = HashSet<Char>()
    var s = arr[0]
    for (i in s) {
        var flag = true
        for (j in 1..arr.size - 1) {
            var s2 = arr[j]
            if (s2.indexOf(i) == -1) flag = false
        }
        if (flag) set.add(i)
    }
    return set.size
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array<String>(n, { "" })
    for (i in 0 until n) {
        val arrItem = scan.nextLine()
        arr[i] = arrItem
    }

    val result = gemstones(arr)

    println(result)
}
