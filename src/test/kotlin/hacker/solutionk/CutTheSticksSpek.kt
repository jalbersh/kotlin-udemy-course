package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class CutTheSticksSpek: Spek({
    fun arrayEquals(a: Array<Int>, b: Array<Int>): Boolean {
        if (a.size != b.size) return false
        for (i in 0 until a.size) {
            if (a[i] != b[i]) return false
        }
        return true
    }
    describe("Determines the integers satisfying the permutation equation") {
        it("calculates 5, 4, 4, 2, 2, 8") {
            var result = cutTheSticks(arrayOf(5, 4, 4, 2, 2, 8))
            var expected = arrayOf<Int>(6,4,2,1)
            assertTrue(arrayEquals(expected,result))
        }
        it("calculates 1,2,3,4,3,3,2,1") {
            var result = cutTheSticks(arrayOf(1,2,3,4,3,3,2,1))
            var expected = arrayOf<Int>(8,6,4,1)
            assertTrue(arrayEquals(expected,result))
        }
    }
})
