package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class SeparateNumbersSpek: Spek({
    describe("Determines if stirng is number sequence") {
        it("calculates YES 99") {
            var result = getSeparateNumbers("99100101")
            var expected = "YES 99"
            assertEquals(expected,result)
        }
        it("calculates YES 1") {
            var result = getSeparateNumbers("1234")
            var expected = "YES 1"
            assertEquals(expected,result)
        }
        it("calculates NO") {
            var result = getSeparateNumbers("01234")
            var expected = "NO"
            assertEquals(expected,result)
        }
    }
})
