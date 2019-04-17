package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class InsertionSort3Spek: Spek({
    describe("creates a sorted array") {
        it("sorts a 7 member array") {
            var result = doInsertionSort3(7, arrayOf(3,4,7,5,6,2,1))
            var expected = arrayOf(1,2,3,4,5,6,7)
            assertTrue(arrayEquals(expected,result))
        }
        it("sorts a 5 member array") {
            var result = doInsertionSort3(6, arrayOf(1,4,3,5,6,2))
            var expected = arrayOf(1,2,3,4,5,6)
            assertTrue(arrayEquals(expected,result))
        }
    }
})
