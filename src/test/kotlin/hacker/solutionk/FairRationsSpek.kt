package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class FairRationsSpek: Spek({
    describe("Determines the number of loaves to distribute") {
        it("calculates 4") {
            var result = fairRations(arrayOf(2,3,4,5,6))
            var expected = "4"
            assertEquals(expected,result)
        }
        it("calculates NO") {
            var result = fairRations(arrayOf(1,2))
            var expected = "NO"
            assertEquals(expected,result)
        }
    }
})
