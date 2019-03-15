package hacker.solutionk

import java.util.*

object OneDArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val n = scan.nextInt()
        val a = IntArray(n)
        for (i in 0 until n) {
            a[i] = scan.nextInt()
        }
        scan.close()
        for (i in a.indices) {
            println(a[i])
        }
    }
}
