package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ViralAdvertisingSpek: Spek({
    describe("Determines the cummulative number of likes after n days") {
        it("returns 2 in 1 day") {
            var count = viralAdvertising(1)
            assertEquals(2, count)
        }
        it("returns 5 in 2 days") {
            var count = viralAdvertising(2)
            assertEquals(5, count)
        }
        it("returns 9 in 3 days") {
            var count = viralAdvertising(3)
            assertEquals(9, count)
        }
        it("returns 15 in 4 days") {
            var count = viralAdvertising(4)
            assertEquals(15, count)
        }
        it("returns 24 in 5 days") {
            var count = viralAdvertising(5)
            assertEquals(24, count)
        }
    }
})
