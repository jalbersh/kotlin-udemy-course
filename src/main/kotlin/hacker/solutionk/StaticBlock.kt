package hacker.solutionk

import java.util.*

object StaticBlock {

    var B = 0
    var H = 0
    var flag = true
    @JvmStatic
    fun main(args: Array<String>) {
        if (flag) {
            val area = B * H
            print(area)
        }
    }

    init {
        val sc = Scanner(System.`in`)
        try {
            B = sc.nextInt()
            H = sc.nextInt()
            if (B < 1 || H < 1) {
                flag = false
                throw Exception("Breadth and height must be positive")
            }
        } catch (e: Exception) {
            println("java.lang.Exception: " + e.message)
        }

    }
}