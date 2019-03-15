package hacker.solutionk

import java.util.*

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val s = scan.nextLine()
        // Write your code here.
        val regex = "\\P{Alpha}+"
        val tokens = s.split(regex.toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var count = 0
        for (i in tokens.indices) {
            var token = tokens[i]
            token = token.trim { it <= ' ' }
            if (token.length == 0) {
                count++
            }
            if (token.contains("'")) count--
        }
        println(tokens.size - count)
        for (element in tokens) {
            if (element.trim { it <= ' ' }.length > 0) {
                if (element.contains("'")) {
                    val elems = element.split("'".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    for (elem in elems) {
                        println(elem)
                    }
                } else
                    println(element)
            }
        }
        scan.close()
    }

