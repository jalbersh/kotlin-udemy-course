package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

fun arrayEquals(a: Array<String>, b: Array<String>): Boolean {
    if (a.size != b.size) return false
    for (i in 0 until a.size) {
        if (a[i] != b[i]) return false
    }
    return true
}
class CavityMapSpek: Spek({
    describe("Determines the cavity map") {
        it("replaces 9s with Xs") {
            var result = cavityMap(arrayOf("1112","1912","1892","1234"))
            var expected = arrayOf("1112","1X12","18X2","1234")
            assertTrue(arrayEquals(expected,result))
        }
        it("replaces 9 with X") {
            var result = cavityMap(arrayOf("989","191","111"))
            var expected = arrayOf("989","1X1","111")
            assertTrue(arrayEquals(expected,result))
        }
    }
})
