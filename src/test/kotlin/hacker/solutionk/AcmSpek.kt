package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class AcmSpek: Spek({
    describe("Determines the Acm numbers") {
        it("calculates 5,2") {
            var result = acmTeam(arrayOf("10101","11100","11010","00101"))
            var expected = arrayOf(5,2)
            assertTrue(arrayEquals(expected,result))
        }
        it("calculates 5,6") {
            var result = acmTeam(arrayOf("11101","10101","11001","10111","10000","01110"))
            var expected = arrayOf(5,6)
            assertTrue(arrayEquals(expected,result))
        }
    }
})
