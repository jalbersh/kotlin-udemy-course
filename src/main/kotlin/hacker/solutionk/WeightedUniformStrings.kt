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
import java.util.HashSet



// Complete the weightedUniformStrings function below.
fun getWeight(s: String): Int {
    var weight:Int = 0
    for (c in s.chars()) {
        weight += c-96
    }
    return weight
}

fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {
    val length = s.length
    val weights = HashSet<Int>(length)
    var multiples = 1
    var weight = 0
    var last: Int = 0
    for (i in 0 until length) {
        weight = s[i].toInt()-96
        if (weight == last) {
            multiples++
            weight = weight * multiples
        } else {
            multiples = 1
            last = weight
        }
        weights.add(weight)
    }
    var subs = Array<String>(queries.size, { i -> "" } )
    for (i in 0 until queries.size) {
        if (weights.contains(queries[i])) {
            subs[i] = "Yes"
        } else {
            subs[i] = "No"
        }
    }
    return subs
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val queriesCount = scan.nextLine().trim().toInt()

    val queries = Array<Int>(queriesCount, { 0 })
    for (i in 0 until queriesCount) {
        val queriesItem = scan.nextLine().trim().toInt()
        queries[i] = queriesItem
    }

    val result = weightedUniformStrings(s, queries)

    println(result.joinToString("\n"))
}
