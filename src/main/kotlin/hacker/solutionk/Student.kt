package hacker.solutionk

import java.util.Comparator

class Student(val id: Int, val fname: String, val cgpa: Double) : Comparator<Student> {
    fun stringCompare(str1: String, str2: String): Int {
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
    override fun compare(o1: Student, o2: Student): Int {
        return if (o1.cgpa == o2.cgpa) {
            if (o1.fname == o2.fname) {
                o2.id - o1.id
            } else stringCompare(o1.fname, o2.fname)
        } else
            (o2.cgpa - o1.cgpa).toInt()
    }
}

