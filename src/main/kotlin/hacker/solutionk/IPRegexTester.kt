package hacker.solutionk

import java.util.*

class IPTester {
    object MyRegex {
        val pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val `in` = Scanner(System.`in`)
            while (`in`.hasNext()) {
                val IP = `in`.next()
                println(IP.matches(MyRegex.pattern.toRegex()))
            }
        }
    }

}