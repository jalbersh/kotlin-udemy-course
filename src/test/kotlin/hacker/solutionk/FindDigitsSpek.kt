package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class FindDigitsSpek: Spek({
    describe("Determines the number of digits that are divisors") {
        it("calculates 2") {
            var result = findDigits(12)
            var expected = 2
            assertEquals(expected,result)
        }
        it("calculates 3") {
            var result = findDigits(1012)
            var expected = 3
            assertEquals(expected,result)
        }
    }
})
