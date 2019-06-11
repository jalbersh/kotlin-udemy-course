package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class FindMedianSpek: Spek({
    describe("finds the median element") {
        it("handles a 5 element array") {
            var result = findMedian(arrayOf(1,2,3,4,5))
            var expected = 3
            assertEquals(expected,result)
        }
        it("handles a 7 element array") {
            var result = findMedian(arrayOf(0,1,2,4,6,4,3))
            var expected = 3
            assertEquals(expected,result)
        }
    }
})
