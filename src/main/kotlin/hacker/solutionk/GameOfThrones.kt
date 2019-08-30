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

// Complete the gameOfThrones function below.
fun gameOfThrones(s: String): String {
    val letters = IntArray(26)
    for (i in 0 until s.length) {
        if (letters[s[i] - 'a'] > 0)
            letters[s[i] - 'a']--
        else
            letters[s[i] - 'a']++
    }
    var count = 0
    for (i in 0..25) count += letters[i]
    return if (count > 1) "NO" else "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = gameOfThrones(s)

    println(result)
}
