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
        it("returns true for dec and cde") {
            assertTrue(Anagram.isAnagram("dec","cde"))
        }
    }
    describe("Check Bad Anagram") {
        it("returns false for abcdefg") {
            assertFalse(Anagram.isAnagram("anagram", "abcdefg"))
        }
    }
})