package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class PageCountSpek: Spek({
    describe("Determines minimum number of page turns") {
        it("has 1 page turn") {
            var turns = pageCount(6,2)
            assertEquals(1,turns)
        }
        it("has 0 turns") {
            var turns = pageCount(5,4)
            assertEquals(0,turns)
        }
        it("has 0 turns from end") {
            var turns = pageCount(4,4)
            assertEquals(0,turns)
        }
        it("has 1 turns from beginning") {
            var turns = pageCount(7,3)
            assertEquals(1,turns)
        }
        it("has 1 turns from end") {
            var turns = pageCount(7,4)
            assertEquals(1,turns)
        }
        it("has 1 turns from end (opposite)") {
            var turns = pageCount(6,5)
            assertEquals(1,turns)
        }
    }
})
