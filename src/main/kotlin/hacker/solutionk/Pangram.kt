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

// Complete the pangrams function below.
fun isPangram(s: String): Boolean {
    val lowercase = s.toLowerCase()
    return ('a'..'z').all { lowercase.contains(it) }
}
fun pangrams(s: String): String {
    var out=""
    if (!isPangram(s)) out += "not "
    out += "pangram"
    return out
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = pangrams(s)

    println(result)
}
