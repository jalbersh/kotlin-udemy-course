package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class StackSpek: Spek({
    describe("Tests stack") {
        it("returns true if empty or null") {
            var s:Stack = Stack()
            assertTrue(s.isEmpty())
        }
        it("returns false if not empty") {
            var s:Stack = Stack()
            s.push("apples")
            assertFalse(s.isEmpty())
        }
        it("returns true of string in elements") {
            var s:Stack = Stack()
            s.push("apples")
            assertEquals("apples",s.peek())
        }
        it("returns null if empty") {
            var s:Stack = Stack()
            assertNull(s.peek())
        }
        it("returns no match if not in elements") {
            var s:Stack = Stack()
            s.push("apples")
            assertNotEquals("oranges",s.peek())
        }
        it( "returns false if contains no elements") {
            var s:Stack = Stack()
            assertFalse(s.contains("anything"))
        }
        it( "returns false if it does not contain element") {
            var s:Stack = Stack()
            s.push("apples")
            assertFalse(s.contains("anything"))
        }
        it( "returns true if it contains element") {
            var s:Stack = Stack()
            s.push("apples")
            assertTrue(s.contains("apples"))
        }
        it( "returns true if it contains element") {
            var s:Stack = Stack()
            s.push("apples")
            s.push("pears")
            s.push("plums")
            assertFalse(s.contains("oranges"))
        }
        it( "returns true if it contains element") {
            var s:Stack = Stack()
            s.push("apples")
            s.push("pears")
            s.push("plums")
            assertTrue(s.contains("apples"))
        }
    }
})
