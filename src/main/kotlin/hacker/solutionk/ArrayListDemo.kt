package hacker.solutionk

import java.lang.NullPointerException
import java.util.*

object ArrayListDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val rows = arrayOfNulls<ArrayList<Integer>>(n)
        for (i in 0 until n) {
            val d = sc.nextInt()
            val row = ArrayList<Integer>()
            for (j in 0 until d) {
                row.add(Integer(sc.nextInt()))
            }
            rows[i] = row
        }
        val q = sc.nextInt();
        for (k in 0 until q) {
            val x = sc.nextInt()
            val y = sc.nextInt()
            try {
                println(rows[x-1]?.get(y-1))
            } catch (e: IndexOutOfBoundsException) {
                println("ERROR!")
            } catch (e1: NullPointerException) {
                println("ERROR!")
            }
        }
        sc.close()
    }
}