package hacker.solutionk

import java.util.*

class UsernameChecker {
    internal object UsernameValidator {
        /*
         * Write regular expression here.
         */
        val regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$"
    }

    companion object {

        private val scan = Scanner(System.`in`)

        @JvmStatic
        fun main(args: Array<String>) {
            var n = Integer.parseInt(scan.nextLine())
            while (n-- != 0) {
                val userName = scan.nextLine()

                if (userName.matches(UsernameValidator.regularExpression.toRegex())) {
                    println("Valid")
                } else {
                    println("Invalid")
                }
            }
        }
    }

}
