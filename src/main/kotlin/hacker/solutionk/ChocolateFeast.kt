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

// Complete the chocolateFeast function below.
fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    var wrappers = n / c;
    var count = wrappers;
    while (wrappers >= m) {
        wrappers -= m
        count += 1
        wrappers += 1
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val ncm = scan.nextLine().split(" ")

        val n = ncm[0].trim().toInt()

        val c = ncm[1].trim().toInt()

        val m = ncm[2].trim().toInt()

        val result = chocolateFeast(n, c, m)

        println(result)
    }
}
/*
wrappers = n/c;

count = wrappers;

while (wrappers >= m) {

wrappers = wrappers - m;

count = count + 1;

wrappers = wrappers + 1;

}
 */