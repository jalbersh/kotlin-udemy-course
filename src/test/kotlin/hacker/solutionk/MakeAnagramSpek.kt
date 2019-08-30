package hacker.solutionk

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertFails
import kotlin.test.assertEquals

class MakeAnagramSpec: Spek({
    describe("Check Good Anagram") {
        it("returns 0") {
            assertEquals(makeAnagram("xyyx"),0)
        }
        it("returns -1") {
            assertEquals(makeAnagram("abc"), -1)
        }
        it("returns 3") {
            assertEquals(makeAnagram("aaabbb"), 3)
        }
        it("returns 1") {
            assertEquals(makeAnagram("ab"), 1)
        }
        it("returns 1 also") {
            assertEquals(makeAnagram("xaxbbbxx"), 1)
        }
    }
})