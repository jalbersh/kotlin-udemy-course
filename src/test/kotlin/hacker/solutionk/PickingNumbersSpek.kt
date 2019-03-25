package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class PickingNumbersSpek: Spek({
    describe("Determines the number of elements in subarray") {
        it("calculates 3") {
            var result = pickingNumbers(arrayOf(4,6,5,3,3,1))
            var expected = 3
            assertEquals(expected,result)
        }
        it("calculates 5") {
            var result = pickingNumbers(arrayOf(1,2,2,3,1,2))
            var expected = 5
            assertEquals(expected,result)
        }
    }
})
