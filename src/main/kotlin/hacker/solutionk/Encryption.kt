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

// Complete the encryption function below.
fun encryption(s: String): String {
    var outStr=""
    val dlen = s.length.toDouble()
    var row = Math.floor(Math.sqrt(dlen)).toInt()
    val col = Math.ceil(Math.sqrt(dlen)).toInt()
    if (row * col < dlen) row = col
    for (i in 0 until col) {
        var j = i
        while (j < dlen) {
            outStr += s[j]
            j = j + col
        }
        if (i < col-1) outStr += " "
    }
    return outStr
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = encryption(s)

    println(result)
}
