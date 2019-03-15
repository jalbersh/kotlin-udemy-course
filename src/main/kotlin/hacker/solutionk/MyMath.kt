package hacker.solutionk

import java.math.BigInteger

object MyMath: PerformOperation {
    override fun isOdd(n: Int): Boolean = mod(n,2) != 0
    override fun isPrime(n: Int): Boolean {
            var flag = true
            for (i in 2..n / 2) {
                if (n % i == 0) {
                    flag = false
                    break
                }
            }
            return flag
    }
    override fun isPalindrome(n: Int): Boolean {
        return n.toString() == StringBuffer(n.toString()).reverse().toString()
    }
    private fun mod(n:Int, i:Int):Int {
       val bn = n.toBigInteger()
       val bi = i.toBigInteger()
       return bn.mod(bi).toInt()
    }
}