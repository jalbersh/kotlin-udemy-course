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
import java.util.stream.Collectors.mapping
import java.util.stream.IntStream
import javax.swing.text.html.HTML.Attribute.N



fun insertionSort4(arr: Array<Int>): Array<Int> {
    var i: Int
    var j: Int
    var value: Int
    i = 1
    while (i < arr.size) {
        value = arr[i]
        j = i - 1
        while (j >= 0 && value < arr[j]) {
            arr[j + 1] = arr[j]
            j = j - 1
        }
        arr[j + 1] = value
        i++
    }
    return arr
}

fun printArray(ar: IntArray) {
    for (n in ar) {
        print("$n ")
    }
}

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val n = `in`.nextInt()
    val ar = arrayOf(n)
    for (i in 0 until n) {
        ar[i] = `in`.nextInt()
    }
    insertionSort4(ar)
}

