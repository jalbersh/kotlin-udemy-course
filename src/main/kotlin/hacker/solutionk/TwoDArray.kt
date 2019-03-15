package hacker.solutionk

import java.util.*

object TwoDArray {
    private val scanner = Scanner(System.`in`)
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = Array(6) { IntArray(6) }

        for (i in 0..5) {
            val arrRowItems = scanner.nextLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")

            for (j in 0..5) {
                val arrItem = Integer.parseInt(arrRowItems[j])
                arr[i][j] = arrItem
            }
        }

        scanner.close()
        var bestSum = -100000
        for (r in 0..3) {
            for (c in 0..3) {
                val h = getHourglass(arr, r, c)
                val `val` = getHourglassSum(h)
                if (`val` > bestSum) bestSum = `val`
            }
        }
        println(bestSum)
    }

    private fun getHourglassSum(a: Array<IntArray>): Int {
        var sum = 0
        for (row in 0..2) {
            if (row == 1) {
                sum += a[row][1]
            } else {
                for (col in 0..2) {
                    sum += a[row][col]
                }
            }
        }
        return sum
    }

    private fun getHourglass(a: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val b = Array(3) { IntArray(3) }
        for (row in 0..2) {
            for (col in 0..2) {
                b[row][col] = a[row + r][col + c]
            }
        }
        return b
    }
}
