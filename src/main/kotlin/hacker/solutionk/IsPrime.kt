package hacker.solutionk

import java.math.BigInteger
import java.util.*

object IsPrime {
    private val scanner = Scanner(System.`in`)
    @JvmStatic
    fun main(args: Array<String>) {
        val s = scanner.nextLine()
        try {
            val num = BigInteger(s)
            var flag = false
            val two = BigInteger("2")
            if (num.divide(two) != BigInteger.ZERO && num.isProbablePrime(80)) {
                flag = true
            }
            if (flag && num !== BigInteger.ONE)
                println("prime")
            else
                println("not prime")
        } catch (nfe: NumberFormatException) {
            println("Problem parsing input=" + s + ": " + nfe.message)
        }
        scanner.close()
    }
}
