package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class BeautifulBinarySpek: Spek({
    describe("Determines how many moves can make a beautiful binary") {
        it("calculates 2") {
            var result = beautifulBinaryString("0101010")
            var expected = 2
            assertEquals(expected,result)
        }
        it("calculates 1") {
            var result = beautifulBinaryString("010")
            var expected = 1
            assertEquals(expected,result)
        }
        it("calculates 0") {
            var result = beautifulBinaryString("01100")
            var expected = 0
            assertEquals(expected,result)
        }
        it("calculates 10") {
            var result = beautifulBinaryString("0100101010100010110100100110110100011100111110101001011001110111110000101011011111011001111100011101")
            var expected = 10
            assertEquals(expected,result)
        }
    }
})
