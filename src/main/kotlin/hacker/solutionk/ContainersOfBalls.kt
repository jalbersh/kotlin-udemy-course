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
import java.util.HashMap

// Complete the organizingContainers function below.
fun organizingContainers(container: Array<Array<Int>>): String {
    val containerTotal = HashMap<Int, Int>()
    val len = container.size
    for (i in 0 until len) {
        var total=0
        for (j in 0 until len) total += container[i][j]
        containerTotal[total] = (containerTotal as java.util.Map<Int, Int>).getOrDefault(total, 0)+1
    }
    for (i in 0 until len) {
        var total=0
        for (j in 0 until len) total += container[j][i]
        if (containerTotal[total] == null || containerTotal[total] == 0)
            return "Impossible"
        containerTotal[total] = containerTotal[total]!!.minus(1)
    }
    return "Possible"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val n = scan.nextLine().trim().toInt()

        val container = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

        for (i in 0 until n) {
            container[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        }

        val result = organizingContainers(container)

        println(result)
    }
}

