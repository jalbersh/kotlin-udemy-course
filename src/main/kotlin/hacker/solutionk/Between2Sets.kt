package hacker.solutionk

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the getTotalX function below.
 */
fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    /*
     * Write your code here.
     */
    var count=0
    var xa_index=0
    var intsThatNumbersAreFactors = Array<Int>(100, { 0 })
    var amax = a.max()!!
    for (i in amax..100) {
        var flag=true
        for (xa in a) {
            if (i % xa != 0) {
                flag = false
            }
        }
        if (flag) intsThatNumbersAreFactors[xa_index++] = i
    }
    for (i in intsThatNumbersAreFactors) {
        if (i != 0) {
            var flag = true
            for (bx in b) {
                if (bx % i != 0) {
                    flag = false
                }
            }
            if (flag) count++
        } else break
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val b = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val total = getTotalX(a, b)

    println(total)
}
