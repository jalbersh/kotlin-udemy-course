package hacker.solutionk

import java.util.*

fun birthdayCakeCandles(ar: Array<Int>): Int {
    ar.sort()
    var max = ar.max()
    var maxes = ar.count { it == max  }
    return maxes
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}
