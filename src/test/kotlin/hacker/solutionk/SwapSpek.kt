package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class SwapSpek: Spek({
    describe("Determines the swap values") {
        it("calculates 2") {
            var s:Swap = Swap()
            var a = 1
            var b = 2
            var result = s.swap(a,b)
            var expected = 2
            assertEquals(1,a)
            assertEquals(2,b)
            assertEquals(2,result)
        }

    }
})
