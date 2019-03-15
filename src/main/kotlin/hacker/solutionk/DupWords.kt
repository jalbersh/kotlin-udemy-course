package hacker.solutionk

import java.util.*
import java.util.regex.Pattern

object DuplicateWords {
    private const val regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+"

    @JvmStatic
    fun main(args: Array<String>) {
        val p = Pattern.compile(regex, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE)
        val `in` = Scanner(System.`in`)
        var numSentences = Integer.parseInt(`in`.nextLine())
        while (numSentences-- > 0) {
            var input = `in`.nextLine()
            val m = p.matcher(input)
            while (m.find()) {
                input = input.replace(m.group().toRegex(), m.group(1))
            }
            println(input)
        }
        `in`.close()
    }
}

