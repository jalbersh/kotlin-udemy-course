package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class ReduceStringSpek: Spek({
    describe("Determines string reduction") {
        it("calculates abc") {
            var result = superReducedString("aaabbbccc")
            var expected = "abc"
            assertEquals(expected,result)
        }
        it("calculates abd") {
            var result = superReducedString("aaabccddd")
            var expected = "abd"
            assertEquals(expected,result)
        }
        it("calculates empty String") {
            var result = superReducedString("aa")
            var expected = "Empty String"
            assertEquals(expected,result)
        }
    }
})
/*










 */