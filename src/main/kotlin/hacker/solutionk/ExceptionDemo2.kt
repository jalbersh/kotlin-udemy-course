package hacker.solutionk

import java.util.*

object ExceptionDemo2 {
    internal class MyCalc {
        fun power(x:Int,y:Int): Long {
            if (x == 0 && y == 0) throw Exception("x and y should not be 0")
            if (x < 0 || y < 0) throw Exception("x or y should not be negative")
            return Math.pow(x.toDouble(), y.toDouble()).toLong()
        }

    }
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val x = sc.nextInt()
        val y = sc.nextInt()
        println(MyCalc().power(x,y))
    }
}