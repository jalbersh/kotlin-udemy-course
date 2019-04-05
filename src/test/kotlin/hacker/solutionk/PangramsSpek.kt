package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class PangramsSpek: Spek({
    describe("Determines if pangram") {
        it("calculates Not") {
            var result = pangrams("We promptly judged antique ivory buckles for the prize")
            var expected = "not pangram"
            assertEquals(expected,result)
        }
        it("calculates Yes") {
            var result = pangrams("We promptly judged antique ivory buckles for the next prize")
            var expected = "pangram"
            assertEquals(expected,result)
        }
        it("calculates Yes again") {
            var result = pangrams("The quick brown fox jumps over the lazy dog")
            var expected = "pangram"
            assertEquals(expected,result)
        }
    }
})
/*










 */