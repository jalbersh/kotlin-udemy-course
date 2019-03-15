package hacker.solutionk

import java.util.*

object StringExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val A = sc.next()
        val B = sc.next()
        println(A.length + B.length)
        println(if (A.compareTo(B) > 0) "Yes" else "No")
        println(
            A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(
                0,
                1
            ).toUpperCase() + B.substring(1)
        )
    }

}