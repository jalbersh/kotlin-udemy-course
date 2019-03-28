package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class NextLexStringSpek: Spek({
    describe("Determines the next lex string") {
        it("calculates ab") {
            var result = biggerIsGreater("ab")
            var expected = "ba"
            assertEquals(expected,result)
        }
        it("calculates bb") {
            var result = biggerIsGreater("bb")
            var expected = "no answer"
            assertEquals(expected,result)
        }
        it("calculates hafg") {
            var result = biggerIsGreater("hefg")
            var expected = "hegf"
            assertEquals(expected,result)
        }
        it("calculates dkhc") {
            var result = biggerIsGreater("dkhc")
            var expected = "hcdk"
            assertEquals(expected,result)
        }
    }
})
