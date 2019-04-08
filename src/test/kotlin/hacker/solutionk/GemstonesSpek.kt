package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class GemstonesSpek: Spek({
    describe("Determines common elements in given gemstones") {
        it("calculates 2") {
            var result = gemstones(arrayOf("abc","abc","bc"))
            var expected = 2
            assertEquals(expected,result)
        }
        it("calculates 2 gain") {
            var result = gemstones(arrayOf("abcdde","baccd","eeabg"))
            var expected = 2
            assertEquals(expected,result)
        }
    }
})
