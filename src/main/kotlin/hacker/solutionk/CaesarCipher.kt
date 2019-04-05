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
import sun.text.normalizer.UTF16.append
import java.util.HashMap

// Complete the caesarCipher function below.
fun caesarCipher(s: String, k: Int): String {
    val map = HashMap<Char, Char>()
    val alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    for (i in 0 until alphabet.size) {
        val cipher_i = (i + k) % 26
        map[alphabet[i]] = alphabet[cipher_i]
    }
    var sb = StringBuilder()
    for (chr in s.toCharArray()) {
        if (chr.isLetter()) {
            if (chr.isUpperCase()) {
                var cipherChr = map.get(chr.toLowerCase())
                sb.append(cipherChr!!.toUpperCase())
            } else {
                var cipherChr = map.get(chr)
                sb.append(cipherChr)
            }
        } else {
            // not an alpha character
            sb.append(chr)
        }
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val k = scan.nextLine().trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}
