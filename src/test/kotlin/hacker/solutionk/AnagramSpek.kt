package hacker.solutionk

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertFails

class AnagramSpec: Spek({
    describe("Check Good Anagram") {
        it("returns true for reverse(margana)") {
            assertTrue(Anagram.isAnagram("anagram", "margana"))
        }
    }
    describe("Check Bad Anagram") {
        it("returns false for abcdefg") {
            assertFalse(Anagram.isAnagram("anagram", "abcdefg"))
        }
    }
})