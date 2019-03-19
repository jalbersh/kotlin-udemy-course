package hacker.solutionk

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals
import kotlin.test.assertFails

class TripletsSpec: Spek({
    describe("Check Triplets") {
        it("returns Array of 2 1") {
            val a = arrayOf(5, 6, 7)
            val b = arrayOf(3, 6, 10)
            var comp: Array<Int> = compareTriplets(a,b)
            assertEquals(arrayOf(2,1),comp)
        }
    }
})