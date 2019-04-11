package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class StringConstructionSpek: Spek({
    describe("Determines cost of constructing unique strings") {
        it("calculates 4") {
            var result = stringConstruction("abcd")
            var expected = 4
            assertEquals(expected,result)
        }
        it("calculates 2") {
            var result = stringConstruction("abab")
            var expected = 2
            assertEquals(expected,result)
        }
    }
})
