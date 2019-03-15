package hacker.solutionk

import java.math.BigInteger
import java.util.*

object BigInt {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val line1 = sc.nextLine()
        val line2 = sc.nextLine()
        sc.close()
        val b1 = BigInteger(line1)
        val b2 = BigInteger(line2)
        println(b1.add(b2))
        println(b1.multiply(b2))
    }
}