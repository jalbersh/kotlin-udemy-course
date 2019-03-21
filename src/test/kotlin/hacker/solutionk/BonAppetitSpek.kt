package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class BonAppetitSpek: Spek({
    describe("Determines if Brian owes Anna") {
        it("shows that Anna paid too much") {
            var bill = arrayOf(2,4,5)
            var value = calcOwed(bill, 2, 4)
            value.toString()
            assertEquals(1,value)
        }
        it("shows that Brian and Anna are even") {
            var bill = arrayOf(3,10,2,9)
            var value = calcOwed(bill, 1, 7)
            assertEquals(0,value)
        }
        it("shows that Anna still owes money") {
            var bill = arrayOf(4,10,2,9)
            var value = calcOwed(bill, 3, 7)
            assertEquals(-1,value)
        }
    }
})
