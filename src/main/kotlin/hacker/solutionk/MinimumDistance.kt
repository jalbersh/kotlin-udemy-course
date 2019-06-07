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
import java.util.stream.Collectors.mapping
import java.util.stream.IntStream

// Complete the minimumDistances function below.
fun minimumDistances(a: Array<Int>): Int {
    var currentDistance = Integer.MAX_VALUE
    var index1: Int = 0
    var index2: Int = 0
    var minDistance = Integer.MAX_VALUE
    var count = 0
    val n = a.size

    index1 = 0
    while (index1 < n - 1) {
        index2 = index1 + 1
        while (index2 < n) {
            if (a[index1] === a[index2]) {
                currentDistance = Math.abs(index1 - index2)
                count++
                break
            }
            index2++
        }
        if (currentDistance < minDistance)
            minDistance = currentDistance
        index1++
    }
    if (count == 0) return -1
    return minDistance
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = minimumDistances(a)

    println(result)
}
