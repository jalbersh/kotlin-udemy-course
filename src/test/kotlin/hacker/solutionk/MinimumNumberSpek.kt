package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class MinimumNumberSpek: Spek({
    describe("Determines the minimum letters to form strong password") {
        it("returns 3") {
            var result = minimumNumber(3,"Ab1")
            var expected = 3
            assertEquals(expected,result)
        }
        it("returns 5") {
            var result = minimumNumber(11,"#HackerRank")
            var expected = 1
            assertEquals(expected,result)
        }
    }
})
