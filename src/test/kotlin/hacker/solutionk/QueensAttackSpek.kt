package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class QueensAttackSpek: Spek({
    describe("Determines the Acm numbers") {
        it("calculates 10") {
            var result = queensAttack(5,3,4,3,arrayOf(arrayOf(5,5),arrayOf(4,2),arrayOf(2,3)))
            var expected = 10
            assertEquals(expected,result)
        }
        it("calculates 0") {
            var result = queensAttack(1,0,1,1,arrayOf(arrayOf(-1,-1)))
            var expected = 0
            assertEquals(expected,result)
        }
        it("calculates 9") {
            var result = queensAttack(4,0,4,4,arrayOf(arrayOf(-1,-1)))
            var expected = 9
            assertEquals(expected,result)
        }
        it("calculates 8") {
            var result = queensAttack(4,1,4,4,arrayOf(arrayOf(1,1)))
            var expected = 8
            assertEquals(expected,result)
        }
        it("calculates 27") {
            var result = queensAttack(8,0,5,4,arrayOf(arrayOf(-1,-1)))
            var expected = 27
            assertEquals(expected,result)
        }
        it("calculates 24") {
            var result = queensAttack(8,1,4,4,arrayOf(arrayOf(5,3)))
            var expected = 24
            assertEquals(expected,result)
        }
        it("calculates 27 again") {
            var result = queensAttack(8,0,4,4,arrayOf(arrayOf(-1,-1)))
            var expected = 27
            assertEquals(expected,result)
        }
    }
})
