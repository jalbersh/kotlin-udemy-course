package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class EqualizingArraySpek: Spek({
    describe("Determines the integers satisfying the permutation equation") {
        it("calculates 33213") {
            var result = equalizeArray(arrayOf(3,3,2,1,3))
            var expected = 2
            assertEquals(expected,result)
        }
        it("calculates 1223") {
            var result = equalizeArray(arrayOf(1,2,2,3))
            var expected = 2
            assertEquals(expected,result)
        }
    }
})
