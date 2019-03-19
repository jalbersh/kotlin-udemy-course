package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class DiagonalDifferenceSpek: Spek({
    describe("Calculate Difference in Diagonal Sums") {
        var diagonal1: Int=0;
        var diagonal2: Int = 0;
        val a: Array<Array<Int>> = arrayOf(arrayOf(11, 2, 4),arrayOf(4,5,6),arrayOf(10,8,-12))
        it("gets diagonal sums") {
            diagonal1 = diagonalSumULtoLR(a)
            diagonal2 = diagonalSumURtoLL(a)
            assertEquals(4,diagonal1)
            assertEquals(19,diagonal2)
        }
        it("gets diffence") {
            diagonal1 = diagonalSumULtoLR(a)
            diagonal2 = diagonalSumURtoLL(a)
            var result:Int = diagonalDifference(a)
            assertEquals(15,result)
        }
    }
})
/*
11 2 4
4 5 6
10 8 -12
 */