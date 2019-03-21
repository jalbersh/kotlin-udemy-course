package hacker.solutionk

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {
    if (n==p) return 0 // end page
    if (p == 1) return 0 // start page
    if (n == p+1) { // desired page is one less than end page
        if (n % 2 == 0) return 1 // if even, add one
        return 0
    }
    if (n / 2 < p) return (n-p)/2 // if desired page is more than half way
    return p/2 // desired page less than halfway
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}