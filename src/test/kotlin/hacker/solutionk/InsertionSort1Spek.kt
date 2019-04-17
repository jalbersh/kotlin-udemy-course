package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class InsertionSort1Spek: Spek({
    describe("creates a sorted array") {
        it("sorts a 5 member array") {
            var result = doInsertionSort1(5, arrayOf(2,4,6,8,3))
            var expected = arrayOf(2,3,4,6,8)
            assertTrue(arrayEquals(expected,result))
        }
    }
})
