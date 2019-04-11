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

// Complete the highestValuePalindrome function below.
fun highestValuePalindrome(s: String, n: Int, k: Int): String {
    val arr = s.toCharArray()
    val changed = IntArray(n)
    var myk = k
    if (myk > 0) {
        for (i in 0 until n/2) {
            if (arr[i] != arr[n-i-1] && myk > 0) {
                myk -= 1
                val c = Math.max(arr[i].toInt(), arr[n-i-1].toInt()).toChar()
                arr[n-i-1] = c
                arr[i] = arr[n-i-1]
                changed[i] = 1
            }
        }
        if (myk > 0) {
            for (i in 0 until n/2) {
                if (myk > 0 && changed[i] == 1 && arr[i] != '9') {
                    arr[n-i-1] = '9'
                    arr[i] = arr[n-i-1]
                    myk -= 1
                } else if (myk >= 2 && arr[i] != '9') {
                    arr[n-i-1] = '9'
                    arr[i] = arr[n-i-1]
                    myk -= 2
                }
            }
            if (n % 2 !== 0 && k > 0)
                arr[n/2] = '9'
        }
    }
    for (i in 0 until n/2) if (arr[i] != arr[n-i-1]) return "-1"
    return String(arr)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val s = scan.nextLine()

    val result = highestValuePalindrome(s, n, k)

    println(result)
}
