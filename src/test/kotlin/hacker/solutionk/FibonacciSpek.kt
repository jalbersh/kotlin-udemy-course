package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class FibonacciSpek: Spek({
    describe("Determines the nth digit in a fibonacci sequence") {
        it("calculates 55") {
            var result = fib(10)
            var expected = 55
            assertEquals(expected,result)
        }
        it("calculates 610") {
            var result = fib(15)
            var expected = 610
            assertEquals(expected,result)
        }
        it("calculates 6765") {
            var result = fib(20)
            var expected = 6765
            assertEquals(expected,result)
        }
        it("calculates big") {
            var result = fib(50)
            var expected = 1341889653
            assertEquals(expected,result)
        }
        it("calculates 100") {
            var result = fib(100)
            var expected = 1800642370
            assertEquals(expected,result)
        }
    }
})
