package hacker.solutionk

import java.util.*

object DequeDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val deque = ArrayDeque<Any>()
        val n = `in`.nextInt()
        val m = `in`.nextInt()
        var max = 0
        val hs = HashSet<Any>()
        for (i in 0 until n) {
            val num = `in`.nextInt()
            deque.add(num)
            hs.add(num)
            if (deque.size == m + 1) {
                val removed = deque.remove() as Int
                if (!deque.contains(removed)) {
                    hs.remove(removed)
                }
            }
            max = Math.max(hs.size, max)
        }
        println(max)
    }
}