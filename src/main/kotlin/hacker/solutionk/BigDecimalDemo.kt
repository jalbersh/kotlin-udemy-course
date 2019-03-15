package hacker.solutionk

import java.math.BigDecimal
import java.util.*

object BigDecimalDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        //Input
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val s = arrayOfNulls<String>(n + 2)
        for (i in 0 until n) {
            s[i] = sc.next()
        }
        sc.close()

        //Write your code here
        Arrays.sort<String>(s, 0, n, Collections.reverseOrder { a1, a2 ->
            val a = BigDecimal(a1)
            val b = BigDecimal(a2)
            a.compareTo(b)
        })
        //Output
        for (i in 0 until n) {
            println(s[i])
        }
    }
}
