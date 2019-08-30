package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

/* 0, 1, 1, 2, 5, 27, 734, 535113 */
class FibonacciModifiedSpek: Spek({
    describe("Determines the nth digit in a fibonacci sequence") {
        it("calculates 5") {
            var result = fibMod(0,1,5)
            var expected = 5
            assertEquals(expected,result)
        }
        it("calculates 6") {
            var result = fibMod(0,1,6)
            var expected = 27
            assertEquals(expected,result)
        }
        it("calculates 7") {
            var result = fibMod(0,1,7)
            var expected = 734
            assertEquals(expected,result)
        }
        it("calculates 8") {
            var result = fibMod(0,1,8)
            var expected = 538783
            assertEquals(expected,result)
        }
        it("calculates 10") {
            var result = fibMod(0,1,10)
            var expected = 2147483647
            assertEquals(expected,result)
        }
        it("calculates 20") {
            var result = fibMod(0,1,20)
            var expected = 2147483647
            assertEquals(expected,result)
        }
    }
})
