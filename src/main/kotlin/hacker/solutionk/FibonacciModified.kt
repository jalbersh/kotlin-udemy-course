package hacker.solutionk

import java.util.*

fun fibMod(t1: Int, t2: Int, n: Int):Int {
    if (n == 1) return 0
    if (n == 2) return 1
    if (n == 3) return 1
    return (fibMod(t1,t2,n - 2) + Math.pow(fibMod(t1,t2,n-1).toDouble(),2.0)).toInt()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t1T2n = scan.nextLine().split(" ")

    val t1 = t1T2n[0].trim().toInt()

    val t2 = t1T2n[1].trim().toInt()

    val n = t1T2n[2].trim().toInt()

    val result = fibMod(t1, t2, n)

    println(result)
}

/* 0, 1, 1, 2, 5, 27, 734, 535113 */
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