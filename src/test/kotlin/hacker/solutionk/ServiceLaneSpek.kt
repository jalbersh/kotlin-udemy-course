package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class ServiceLaneSpek: Spek({
    describe("Determines size of largest vehicle") {
        it("returns 1,2,3,2,1") {
            var result = serviceLane(5, arrayOf(arrayOf(0,3),arrayOf(4,6),arrayOf(6,7),arrayOf(3,5),arrayOf(0,7)),arrayOf(2,3,1,2,3,2,3,3))
            var expected = arrayOf(1,2,3,2,1)
            assertTrue(arrayEquals(expected,result))
        }
    }
})
