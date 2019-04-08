package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class FunnyStringSpek: Spek({
    describe("Determines if String is funny") {
        it("calculates funny") {
            var result = funnyString("acxz")
            var expected = "Funny"
            assertEquals(expected,result)
        }
        it("calculates funny again") {
            var result = funnyString("lmnop")
            var expected = "Funny"
            assertEquals(expected,result)
        }
        it("calculates not funny") {
            var result = funnyString("bcxz")
            var expected = "Not Funny"
            assertEquals(expected,result)
        }
    }
})
