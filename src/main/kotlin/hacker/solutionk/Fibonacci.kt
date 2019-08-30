package hacker.solutionk

import java.util.*

var f = arrayOf( 0,1,1,2,3,5 )
fun fib(n: Int):Int {
    val phi = 1.6180339
    if (n < 6) return f.get(n)
    var t = 5
    var fn = 5
    while (t < n) {
        fn = Math.round(fn*phi).toInt()
        t++
    }
    return fn
}

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    while (`in`.hasNext()) {
        val n = `in`.next()
        println(fib(Integer.parseInt(n)))
    }
}

/* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 */
/*
object Solution {
    def toInt(s: String): Int = {
        try {
            s.toInt
        } catch {
            case e: Exception => 0
        }
    }
    def getFibonacci(n : Int) : Int = {
        if (n == 0) 0
        else if (n < 3) 1
        else getFibonacci(n-1) + getFibonacci(n-2)
    }
    def main(args: Array[String]) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        val snum=scala.io.StdIn.readLine()
        val num = toInt(snum)
        var cnt = 0
        do {
            val s=scala.io.StdIn.readLine()
            println(getFibonacci(toInt(s)))
            cnt = cnt + 1
        } while (cnt < num)
    }
}
 */
/*
import scala.math.BigInt
import scala.annotation.tailrec

/* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377 */
object Solution {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
    def toInt(s: String): Int = { try { s.toInt } catch { case e: Exception => 0 } }
    def fibs(n: Long): Long = {

       var first = 0.asInstanceOf[Number].longValue
       var second = 1.asInstanceOf[Number].longValue
       var count = 0

       while(count < n){
          val sum = first + second
          first = second
          second = sum
          count = count + 1
       }

       return first
    }
    def main(args: Array[String]) {
        val snum=scala.io.StdIn.readLine()
        val num = toInt(snum)
        var cnt = 0
        do {
            val s = scala.io.StdIn.readLine()
            val n = toInt(s)
            val nth = fibs(n.longValue)
            println(nth)
            cnt = cnt + 1
        } while (cnt < num)
    }
}
 */