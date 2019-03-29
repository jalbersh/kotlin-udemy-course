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

// Complete the taumBday function below.
fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): BigInteger {
    return (b.toBigInteger()*Math.min(bc,wc+z).toBigInteger())+w.toBigInteger()*Math.min(wc,bc+z).toBigInteger()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val bw = scan.nextLine().split(" ")

        val b = bw[0].trim().toInt()

        val w = bw[1].trim().toInt()

        val bcWcz = scan.nextLine().split(" ")

        val bc = bcWcz[0].trim().toInt()

        val wc = bcWcz[1].trim().toInt()

        val z = bcWcz[2].trim().toInt()

        val result = taumBday(b, w, bc, wc, z)

        println(result)
    }
}
