package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class HighestValuePalindromeSpek: Spek({
    describe("Determines the highest value palindrome") {
        it("calculates 992299") {
            var result = highestValuePalindrome("092282",6,3)
            var expected = "992299"
            assertEquals(expected,result)
        }
        it("calculates 3993") {
            var result = highestValuePalindrome("3943",4,1)
            var expected = "3993"
            assertEquals(expected,result)
        }
        it("calculates -1") {
            var result = highestValuePalindrome("0011",4,1)
            var expected = "-1"
            assertEquals(expected,result)
        }
        it("calculates 99399") {
            var result = highestValuePalindrome("11331",5,4)
            var expected = "99399"
            assertEquals(expected,result)
        }
    }
})
