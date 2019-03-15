package hacker.solutionk

import java.util.*

object LargestSmallest {
    fun getSmallestAndLargest(s: String, k: Int): String {
        var smallest: String? = ""
        var largest: String? = ""

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        val numSubs = s.length - k + 1
        val subs = arrayOfNulls<String>(numSubs)
        for (i in 0 until s.length - k + 1) {
            subs[i] = s.substring(i, i + k)
        }
        java.util.Arrays.sort(subs)
        smallest = subs[0]
        largest = subs[subs.size - 1]

        return smallest + "\n" + largest
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val s = scan.next()
        val k = scan.nextInt()
        scan.close()

        println(getSmallestAndLargest(s, k))
    }

}
