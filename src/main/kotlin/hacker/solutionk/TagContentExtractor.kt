package hacker.solutionk

import java.util.*
import java.util.regex.Pattern

object TagContentExtractor {
    val tagExpression = "<(.+)>([^<]+)</\\1>"
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var testCases = Integer.parseInt(`in`.nextLine())
        while (testCases > 0) {
            val line = `in`.nextLine()
            var matchFound = false
            val r = Pattern.compile(tagExpression)
            val m = r.matcher(line)
            while (m.find()) {
                println(m.group(2))
                matchFound = true
            }
            if (!matchFound) {
                println("None")
            }
            testCases--
        }
    }
}