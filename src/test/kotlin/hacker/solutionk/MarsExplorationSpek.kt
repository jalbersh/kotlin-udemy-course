package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class MarsExplorationSpek: Spek({
    describe("Determines number of changes") {
        it("calculates 1") {
            var result = marsExploration("SOSSOT")
            var expected = 1
            assertEquals(expected,result)
        }
        it("calculates 3") {
            var result = marsExploration("SOSSPSSQSSOR")
            var expected = 3
            assertEquals(expected,result)
        }
        it("calculates 0") {
            var result = marsExploration("SOSSOS")
            var expected = 0
            assertEquals(expected,result)
        }    }
})
