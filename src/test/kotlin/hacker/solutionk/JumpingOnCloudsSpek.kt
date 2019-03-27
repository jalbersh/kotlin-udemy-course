package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class JumpingOnCloudsSpek: Spek({
    describe("Determines the integers satisfying the permutation equation") {
        it("calculates 0,0,1,0,0,1,1,0") {
            var result = jumpingOnClouds(arrayOf(0,0,1,0,0,1,1,0), 2)
            var expected = 92
            assertEquals(expected,result)
        }
        it("calculates 0,0,1,0") {
            var result = jumpingOnClouds(arrayOf(0,0,1,0),2)
            var expected = 96
            assertEquals(expected,result)
        }
    }
})
