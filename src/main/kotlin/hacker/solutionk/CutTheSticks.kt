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
import java.util.Arrays



// Complete the cutTheSticks function below.
fun cutTheSticks(arr: Array<Int>): Array<Int> {
    var inArray = arr
    var outList = ArrayList<Int>()
    Arrays.sort(inArray)
    var i = 0
    while (i < inArray.size) {
        if (inArray.get(0) === 0) {
            inArray = inArray.copyOfRange(1,inArray.size)
            i = -1
            i++
            continue
        }
        outList.add(inArray.size)
        val min = inArray.get(0)
        for (j in 0 until inArray.size) {
            inArray.set(j, inArray.get(j) - min)
        }
        i++
    }
    return outList.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = cutTheSticks(arr)

    println(result.joinToString("\n"))
}
