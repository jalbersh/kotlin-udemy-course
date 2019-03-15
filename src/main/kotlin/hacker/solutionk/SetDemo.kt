package hacker.solutionk

import java.util.*

object SetDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        val t = s.nextInt()
        val pair_left = arrayOfNulls<String>(t)
        val pair_right = arrayOfNulls<String>(t)

        for (i in 0 until t) {
            pair_left[i] = s.next()
            pair_right[i] = s.next()
        }
        //Write your code here
        val set = HashSet<String>()
        for (i in 0 until t) {
            set.add(pair_left[i] + "_" + pair_right[i])
            println(set.size)
        }
    }

}
