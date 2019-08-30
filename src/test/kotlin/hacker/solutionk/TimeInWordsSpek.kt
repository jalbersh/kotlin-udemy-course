package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class TimeInWordsSpek: Spek({
    describe("Determines time in words") {
        it("calculates 5:00") {
            var result = timeInWords(5,0)
            var expected = "five o' clock"
            assertEquals(expected,result)
        }
        it("calculates 5:01") {
            var result = timeInWords(5,1)
            var expected = "one minute past five"
            assertEquals(expected,result)
        }
        it("calculates 5:10") {
            var result = timeInWords(5,10)
            var expected = "ten minutes past five"
            assertEquals(expected,result)
        }
        it("calculates 5:15") {
            var result = timeInWords(5,15)
            var expected = "quarter past five"
            assertEquals(expected,result)
        }
        it("calculates 5:30") {
            var result = timeInWords(5,30)
            var expected = "half past five"
            assertEquals(expected,result)
        }
        it("calculates 5:40") {
            var result = timeInWords(5,40)
            var expected = "twenty minutes to six"
            assertEquals(expected,result)
        }
        it("calculates 5:45") {
            var result = timeInWords(5,45)
            var expected = "quarter to six"
            assertEquals(expected,result)
        }
        it("calculates 5:47") {
            var result = timeInWords(5,47)
            var expected = "thirteen minutes to six"
            assertEquals(expected,result)
        }
        it("calculates 5:28") {
            var result = timeInWords(5,28)
            var expected = "twenty eight minutes past five"
            assertEquals(expected,result)
        }
        it("calculates 6:35") {
            var result = timeInWords(6,35)
            var expected = "twenty five minutes to seven"
            assertEquals(expected,result)
        }
    }
})
