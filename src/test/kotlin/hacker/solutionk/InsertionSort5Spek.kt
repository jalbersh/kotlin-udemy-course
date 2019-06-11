package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class InsertionSort5Spek: Spek({
    describe("creates a sorted array") {
        it("sorts a sorted array") {
            var result = insertionSort5(arrayOf(1,1,1,2,2))
            var expected = 0
            assertEquals(expected,result)
        }
        it("sorts a 4 member array") {
            var result = insertionSort5(arrayOf(4,3,2,1))
            var expected = 6
            assertEquals(expected,result)
        }
        it("sorts a 5 member array") {
            var result = insertionSort5(arrayOf(2,1,3,1,2))
            var expected = 4
            assertEquals(expected,result)
        }
    }
})
