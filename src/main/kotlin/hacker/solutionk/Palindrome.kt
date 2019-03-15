package hacker.solutionk

import java.util.*

object Palindrome {
    fun reverse(`in`: String): String {
        //        in = in.toLowerCase();
        var out = ""
        for (i in `in`.length - 1 downTo 0) {
            out += `in`.toCharArray()[i]
        }
        return out
    }

    fun isPalindrome(input: String): String {
        println("comparing " + input + " with " + reverse(input))
        return if (input == reverse(input)) "Yes" else "No"
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val A = sc.next()
        println(isPalindrome(A))
    }
}
