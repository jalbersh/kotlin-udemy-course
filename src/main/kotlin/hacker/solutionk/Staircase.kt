package hacker.solutionk

import java.util.*

fun staircase(n: Int): Unit {
    for (i in 1..n) {
        for (j in 0 until n - i) print(" ");
        for (j in n - i until n) print("#")
        println()
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}