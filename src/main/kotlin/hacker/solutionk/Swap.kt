package hacker.solutionk

import java.util.*

class Swap {
    fun swap(x:Int, y:Int): Int {
        var temp1: Int = x
        var temp2: Int = y
        temp1 = y
        temp2 = x
        println("inner x=$x, y=$y")
        println("inner temp1=$temp1, temp2=$temp2")
        return temp1
    }

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        var a = scan.next().toInt()
        var b = scan.next().toInt()
        scan.close()
        println("before: a=$a, b=$b")
        val ret = swap(a, b)
        println("after: a=$a, b=$b, ret=$ret")
    }
}