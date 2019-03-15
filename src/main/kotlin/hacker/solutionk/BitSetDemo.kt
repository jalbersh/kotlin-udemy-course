package hacker.solutionk

import java.util.*

object BitSetDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val operations = sc.nextInt()
        val B1 = BitSet(n)
        val B2 = BitSet(n)
        for (i in 0 until operations) {
            val operation = sc.next()
            val setNum = sc.nextInt()
            val index = sc.nextInt()
            if (operation == "AND") {
                if (setNum == 1)
                    B1.and(B2)
                else
                    B2.and(B1)
            } else if (operation == "OR") {
                if (setNum == 1)
                    B1.or(B2)
                else
                    B2.or(B1)
            } else if (operation == "XOR") {
                if (setNum == 1)
                    B1.xor(B2)
                else
                    B2.xor(B1)
            } else if (operation == "FLIP") {
                if (setNum == 1)
                    B1.flip(index)
                else
                    B2.flip(index)
            } else if (operation == "SET") {
                if (setNum == 1)
                    B1.set(index)
                else
                    B2.set(index)
            }
            println(B1.cardinality().toString() + " " + B2.cardinality())
        }
    }
}