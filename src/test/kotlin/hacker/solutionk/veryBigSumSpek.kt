package hacker.solutionk

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals
import kotlin.test.assertFails

class VeryBigSumSpec: Spek({
    describe("Calculate Sum") {
        it("returns big sum") {
            val a: Array<Long> = arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
            var result: Long = aVeryBigSum(a)
            assertEquals(5000000015,result)
        }
    }
})