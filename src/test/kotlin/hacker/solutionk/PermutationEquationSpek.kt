package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class PermutationEquationSpek: Spek({
    describe("Determines the integers satisfying the permutation equation") {
        it("calculates 2,3,1") {
            var result = permutationEquation(arrayOf(2,3,1))
            for (i in 0 until result.size) println(result[i])
            var expected = arrayOf<Int>(2,3,1)
            assertEquals(expected,result)
        }
        it("calculates 4,3,5,1,2") {
            var result = permutationEquation(arrayOf(4,3,5,1,2))
            var expected = arrayOf<Int>(1,3,5,4,2)
            assertEquals(expected,result)
        }
    }
})
