package hacker.solutionk

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var leastCount=0
    var highCount=0
    var least=Int.MAX_VALUE
    var most=Int.MIN_VALUE
    var vals = Array<Int> (2,{0})
    for (i in scores)
    {
        if (i>most) {
            if (most != Int.MIN_VALUE) highCount++
            most = i
        }
        if (i<least) {
            if(least != Int.MAX_VALUE) leastCount++
            least = i
        }
    }
    vals[0] = highCount
    vals[1] = leastCount
    return vals
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
