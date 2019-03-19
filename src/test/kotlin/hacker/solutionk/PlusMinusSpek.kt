package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class PlusMinusSpek: Spek({
    describe("Calculate Fractions of Positive, Negative and Zero values in array") {
        val a: Array<Int> = arrayOf(-4,3,-9,0,4,1)
        it("get fraction of negatives") {
            var negFrac = getNegativeFraction(a)
            assertEquals(((2.toDouble()/6.toDouble())),negFrac)
        }
        it("get fraction of positives") {
            var posFrac = getPositiveFraction(a)
            assertEquals((3.toDouble()/6.toDouble()),posFrac)
        }
        it("get fraction of zeroes") {
            var zeroFrac = getZeroFraction(a)
            assertEquals((1.toDouble()/6.toDouble()),zeroFrac)
        }
    }
})
/*
11 2 4
4 5 6
10 8 -12
 */