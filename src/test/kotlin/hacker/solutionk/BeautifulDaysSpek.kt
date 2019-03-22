package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class BeautifulDaysSpek: Spek({
    describe("Determines if number-reverse is evenly divided by given number") {
        it("returns 2") {
            var count = beautifulDays(20, 23, 6)
            assertEquals(2, count)
        }
    }
    describe("Gets the reverse of a given number") {
        it("returns a reverse of 20") {
            var reverse = reverse(20)
            assertEquals(2,reverse)
        }
        it("returns a reverse of 21") {
            var reverse = reverse(21)
            assertEquals(12,reverse)
        }
        it("returns a reverse of 22") {
            var reverse = reverse(23)
            assertEquals(32,reverse)
        }
    }
})
