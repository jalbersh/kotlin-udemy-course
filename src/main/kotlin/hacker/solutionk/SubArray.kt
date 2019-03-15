package hacker.solutionk

import java.util.*

object SubArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val n = scan.nextInt()
        val a = IntArray(n)
        for (i in 0 until n) {
            a[i] = scan.nextInt()
        }
        scan.close()
        var negCount = 0
        for (i in a.indices) {
            for (j in a.indices) {
                if (sumSub(a, i, j) < 0) negCount++
            }
        }
        println(negCount)
    }

    private fun sumSub(arr: IntArray, i: Int, j: Int): Int {
        var sum = 0
        for (k in i..j) sum += arr[k]
        return sum
    }
}
