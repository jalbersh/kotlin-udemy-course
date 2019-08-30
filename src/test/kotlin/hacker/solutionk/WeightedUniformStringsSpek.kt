package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class WeightedUniformStringsSpek: Spek({
    describe("Checking uniform weights") {
        it("evaluates 5 queries") {
            var result = weightedUniformStrings("aaabbbbcccddd", arrayOf(9,7,8,12,5))
            var expected = arrayOf("Yes","No","Yes","Yes","No")
            assertTrue(arrayEquals(expected,result))
        }
    }
    describe("check substring weights") {
        it("evaluates aaaa") {
            var result = getWeight("aaa")
            var expected = 3
            assertEquals(expected,result)
        }
        it("evaluates apple") {
            var result = getWeight("apple")
            var expected = 50
            assertEquals(expected,result)
        }
        it("evaluates zzzz") {
            var result = getWeight("zzzz")
            var expected = 104
            assertEquals(expected,result)
        }
    }
})
