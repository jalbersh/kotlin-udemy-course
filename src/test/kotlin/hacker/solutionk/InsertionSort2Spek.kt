package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

fun arrayEquals2(a: Array<Int>, b: Array<Int>): Boolean {
    if (a.size != b.size) return false
    for (i in 0 until a.size) {
        if (a[i] != b[i]) return false
    }
    return true
}
class InsertionSort2Spek: Spek({
    describe("creates a sorted array") {
        it("sorts a 5 member array") {
            var result = doInsertionSort2(5, arrayOf(2,4,6,8,3))
            var expected = arrayOf(2,3,4,6,8)
            assertTrue(arrayEquals2(expected,result))
        }
        it("sorts a 7 member array") {
            var result = doInsertionSort2(7, arrayOf(3,4,7,5,6,2,1))
            var expected = arrayOf(1,2,3,4,5,6,7)
            assertTrue(arrayEquals2(expected,result))
        }
    }
})
