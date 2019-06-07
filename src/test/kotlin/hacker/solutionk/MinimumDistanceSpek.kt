package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class MinimumDistanceSpek: Spek({
    describe("Determines the minimum distance between indices") {
        it("returns 2") {
            var result = minimumDistances(arrayOf(3,2,1,2,3))
            var expected = 2
            assertEquals(expected,result)
        }
        it("returns 3") {
            var result = minimumDistances(arrayOf(7,1,3,4,1,7))
            var expected = 3
            assertEquals(expected,result)
        }
    }
})
