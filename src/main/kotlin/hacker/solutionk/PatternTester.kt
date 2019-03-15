package hacker.solutionk

import java.util.*
import java.util.regex.Pattern

object PatternTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var testCases = Integer.parseInt(`in`.nextLine())
        while (testCases > 0) {
            val pattern = `in`.nextLine()
            //Write your code
            try {
                Pattern.compile(pattern)
                println("Valid")
            } catch (e: Exception) {
                println("Invalid")
            }
            testCases--
        }
        `in`.close()
    }
}
