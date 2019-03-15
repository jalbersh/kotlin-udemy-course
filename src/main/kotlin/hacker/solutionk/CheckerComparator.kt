package hacker.solutionk

import java.util.Comparator

class CheckerComparator : Comparator<Player> {
    private fun stringCompare(str1: String, str2: String): Int {
        val l1 = str1.length
        val l2 = str2.length
        val lmin = Math.min(l1, l2)
        for (i in 0 until lmin) {
            val str1_ch = str1[i].toInt()
            val str2_ch = str2[i].toInt()

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch
            }
        }
        return if (l1 != l2) {
            l1 - l2
        } else {
            0
        }
    }
    override fun compare(o1: Player, o2: Player): Int {
        return if (o1.score == o2.score) {
            if (o1.name == o2.name) 0 else stringCompare(o1.name, o2.name)
        } else
            o2.score - o1.score
    }
}
