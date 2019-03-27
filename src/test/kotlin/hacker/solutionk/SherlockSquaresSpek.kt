package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class SherlockSquaresSpek: Spek({
    describe("Determines the number of elements in subarray") {
        it("calculates 2") {
            var result = squares(3,9)
            var expected = 2
            assertEquals(expected,result)
        }
        it("calculates 0") {
            var result = squares(17,24)
            var expected = 0
            assertEquals(expected,result)
        }
        it("calculates 9855") {
            var result = squares(465868129,988379794)
            var expected = 9855
            assertEquals(expected,result)
        }
    }
})
