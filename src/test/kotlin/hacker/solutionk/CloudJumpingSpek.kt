package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class CloudJumpingSpek: Spek({
    describe("Determines the minimum jumps") {
        it("returns 3") {
            var result = jumpingOnClouds(arrayOf(0,0,0,1,0,0))
            var expected = 3
            assertEquals(expected,result)
        }
        it("returns 4") {
            var result = jumpingOnClouds(arrayOf(0,0,1,0,0,1,0))
            var expected = 4
            assertEquals(expected,result)
        }
        it("returns 6") {
            var result = jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0))
            var expected = 6
            assertEquals(expected,result)
        }
    }
})
