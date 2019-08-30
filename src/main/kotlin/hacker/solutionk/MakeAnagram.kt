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

// Complete the anagram function below.
fun makeAnagram(s: String): Int {
    var length = s.length
    if (length % 2 != 0) return -1
    var front = s.substring(0,length/2)
    var back = s.substring(length/2,length)
    if (Anagram.isAnagram(front,back)) return 0
    var count=0
    val chars = front.toCharArray()
    for (c in chars) {
        val index = back.indexOf(c)
        if (index == -1) {
            count++
        } else {
            back = back.substring(0, index) + back.substring(index + 1)
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = makeAnagram(s)

        println(result)
    }
}
