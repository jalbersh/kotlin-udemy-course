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

fun convertBinaryToDecimal(num: Long): Int {
    var num = num
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}
fun convertDecimalToBinary(n: Int): Long {
    var n = n
    var binaryNumber: Long = 0
    var remainder: Int
    var i = 1
    var step = 1

    while (n != 0) {
        remainder = n % 2
//        System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n / 2)
        n /= 2
        binaryNumber += (remainder * i).toLong()
        i *= 10
    }
    return binaryNumber
}
// Complete the kaprekarNumbers function below.
fun getKaprekarNumbers(p: Int, q: Int): List<Int> {
    var list = ArrayList<Int>()
    for (i in p..q) {
        var sqr: BigInteger = i.toBigInteger()*i.toBigInteger()
        var s = sqr.toString()
        var len = s.length
        var first = if (len > 1) s.substring(0,len/2) else s
        var last = if (len > 1) s.substring(len/2) else "0"
        if (Integer.parseInt(first)+Integer.parseInt(last) == i) list.add(i)
    }
    if (list.isEmpty()) list.add(p-1)
    return list
}
fun kaprekarNumbers(p: Int, q: Int): Unit {
    var list = getKaprekarNumbers(p,q)
    for (a in list) {
        if (a >= p && a <= q) print(a.toString()+" ")
        else print("INVALID RANGE")
    }
    println(convertDecimalToBinary("10101".toInt(2) or "11010".toInt(2)))
}
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val p = scan.nextLine().trim().toInt()

    val q = scan.nextLine().trim().toInt()

    kaprekarNumbers(p, q)
}
