package hacker.solutionk

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

object Solution {

    private val scan = Scanner(System.`in`)

    fun getNextMultipleOf5(n: Int): Int {
        if (n % 5 == 0) return n
        for (i in 1 until 3) {
            if ((n+i)%5 == 0) return n+i;
        }
        return n
    }
    /*
     * Complete the gradingStudents function below.
     */
    fun gradingStudents(grades: Array<Int>): Array<Int> {
        /*
         * Write your code here.
         */
        var outArray = grades
        for (i in 0 until grades.size) {
            if (grades[i] < 38) outArray[i]=grades[i]
            if (grades[i] >= 38) outArray[i]=getNextMultipleOf5(grades[i])
        }
        return outArray
    }

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val n = scan.nextLine().trim().toInt()

        val grades = Array<Int>(n, { 0 })
        for (gradesItr in 0 until n) {
            val gradesItem = scan.nextLine().trim().toInt()
            grades[gradesItr] = gradesItem
        }

//        println(grades)
        val result = gradingStudents(grades)
//        println(result)

        println(result.joinToString("\n"))
    }
}
