package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class LoveLetterMysterySpek: Spek({
    describe("Determines how many moves can make a palindrome") {
        it("calculates 5") {
            var result = theLoveLetterMystery("lmnop")
            var expected = 5
            assertEquals(expected,result)
        }
        it("calculates 9") {
            var result = theLoveLetterMystery("adslkfjas")
            var expected = 9
            assertEquals(expected,result)
        }
        it("calculates 7") {
            var result = theLoveLetterMystery("bafhaef")
            var expected = 7
            assertEquals(expected,result)
        }
        it("calculates 7 again") {
            var result = theLoveLetterMystery("ofrhase")
            var expected = 7
            assertEquals(expected,result)
        }
    }
})
