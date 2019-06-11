package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class RunningTimeSpek: Spek({
    describe("Determines minimum number of shifts to sort") {
        it("returns 1,2,3,2,1") {
            var result = runningTime(arrayOf(2,1,3,1,2))
            var expected = 4
            assertEquals(expected,result)
        }
    }
})
