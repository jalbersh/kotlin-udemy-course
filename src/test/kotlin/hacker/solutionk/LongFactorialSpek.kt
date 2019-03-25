package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class LongFactorialSpek: Spek({
    describe("Determines a long factorial") {
        it("calculates 25 facctorial") {
            var result = calculateFactorial(25)
            assertEquals("15511210043330985984000000",result)
        }
        it("calculates 30 facctorial") {
            var result = calculateFactorial(30)
            assertEquals("265252859812191058636308480000000",result)
        }
    }
})
