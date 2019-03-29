package hacker.solutionk

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

fun nextCombo(arr: CharArray): Boolean {
    var index = arr.size-1
    while (index > 0 && arr[index-1] >= arr[index]) index--
    if (index <= 0) return false
    var last = getSwapIndex(arr,index-1)
    bitXor(arr, index-1, last)
    last = arr.size-1
    while (index < last) {
        bitXor(arr, index, last)
        index++
        last--
    }
    return true
}
fun getSwapIndex(chars: CharArray, pos: Int): Int {
    var index = chars.size-1
    while (chars[index] <= chars[pos]) index--
    return index
}
fun bitXor(chars: CharArray, a1: Int, a2: Int) {
    chars[a1] = (chars[a1].toInt() xor chars[a2].toInt()).toChar()
    println(chars[a1].toInt().toString()+" xor "+chars[a2].toInt().toString()+"="+(chars[a1].toInt() xor chars[a2].toInt()))
    println("resulting char="+(chars[a1].toInt() xor chars[a2].toInt()).toChar())
    chars[a2] = (chars[a2].toInt() xor chars[a1].toInt()).toChar()
    chars[a1] = (chars[a1].toInt() xor chars[a2].toInt()).toChar()
}
fun biggerIsGreater(w: String): String {
    println("string="+w)
    val chars = w.toCharArray()
    println("chars="+String(chars))
    if (nextCombo(chars)) {
        return String(chars)
    }
    return "no answer"
}
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val T = scan.nextLine().trim().toInt()

    for (TItr in 1..T) {
        val w = scan.nextLine()

        val result = biggerIsGreater(w)

        println(result)
    }
}
