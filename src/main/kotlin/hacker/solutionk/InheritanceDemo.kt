package hacker.solutionk

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

object InheritanceDemo {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val ob = MyMath
        val br = BufferedReader(InputStreamReader(System.`in`))
        var T = Integer.parseInt(br.readLine())
        var ret = false
        var ans: String? = null
        while (T-- > 0) {
            val s = br.readLine().trim { it <= ' ' }
            val st = StringTokenizer(s)
            val ch = Integer.parseInt(st.nextToken())
            val num = Integer.parseInt(st.nextToken())
            if (ch == 1) {
                ret = ob.isOdd(num)
                ans = if (ret) "ODD" else "EVEN"
            } else if (ch == 2) {
                ret = ob.isPrime(num)
                ans = if (ret) "PRIME" else "COMPOSITE"
            } else if (ch == 3) {
                ret = ob.isPalindrome(num)
                ans = if (ret) "PALINDROME" else "NOT PALINDROME"
            }
            println(ans)
        }
    }
}
