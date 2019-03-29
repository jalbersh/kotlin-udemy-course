package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class KaprekarNumbersSpek: Spek({
    describe("Determines the kaprekar numbers") {
        it("calculates 1,9,45,55,99") {
            var result = getKaprekarNumbers(1,100)
            var expected = arrayOf(1,9,45,55,99)
            assertTrue(arrayEquals(expected,result.toTypedArray()))
        }
        it("INVALID RANGE") {
            var result = getKaprekarNumbers(296,300)
            var expected = arrayOf(297)
            assertTrue(arrayEquals(expected,result.toTypedArray()))
        }
        it("calculates 45") {
            var result = getKaprekarNumbers(40,60)
            var expected = arrayOf(45,55)
            assertTrue(arrayEquals(expected,result.toTypedArray()))
        }
        it("calculates 1 to 99999") {
            var result = getKaprekarNumbers(77777,99999)
            var expected = arrayOf(77778,82656,95121,99999)
            assertTrue(arrayEquals(expected,result.toTypedArray()))
        }
    }
})
