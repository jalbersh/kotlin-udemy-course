package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class InsertionSort4Spek: Spek({
    describe("creates a sorted array") {
        it("sorts a 6 member array") {
            var result = insertionSort4(arrayOf(7,4,3,5,6,2))
            var expected = arrayOf(2,3,4,5,6,7)
            assertTrue(arrayEquals(expected,result))
        }
        it("sorts a 4 member array") {
            var result = insertionSort4(arrayOf(4,3,2,1))
            var expected = arrayOf(1,2,3,4)
            assertTrue(arrayEquals(expected,result))
        }
    }
})
