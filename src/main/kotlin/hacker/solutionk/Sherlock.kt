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
fun sherlockIsValid(s: String): String {
    val letters = IntArray(26)
    for (i in 0..25) letters[i] = -1
    for (i in 0 until s.length) {
        letters[s[i] - 'a']++
    }
    var count = -1
    for (i in 0..25) {
        if (letters[i] != -1) {
            if (count == -1) count = letters[i]
            else {
                if (count != letters[i]) return "NO"
            }
        }
    }
    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = sherlockIsValid(s)

    println(result)
}
