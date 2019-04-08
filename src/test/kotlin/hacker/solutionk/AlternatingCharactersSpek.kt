package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class AlternatingCharactersSpek: Spek({
    describe("Determines string repeats") {
        it("calculates 6") {
            var result = alternatingCharacters("aaabbbccc")
            var expected = 6
            assertEquals(expected,result)
        }
        it("calculates 5") {
            var result = alternatingCharacters("aaabccddd")
            var expected = 5
            assertEquals(expected,result)
        }
        it("calculates 1") {
            var result = alternatingCharacters("aa")
            var expected = 1
            assertEquals(expected,result)
        }
    }
})
/*










 */