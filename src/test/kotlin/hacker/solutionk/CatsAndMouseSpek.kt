package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class CatsAndMouseSpek: Spek({
    describe("Determines which cat gets the mouse, or if the mouse gets away(tie)") {
        it("Cat B gets the mouse") {
            var which = catAndMouse(1,2,3)
            assertEquals("Cat B",which)
        }
//        it("Cat A gets the mouse") {
//            var max = getMoneySpent(arrayOf(4),arrayOf(5), 4)
//            assertEquals(-1,max)
//        }
        it("The mouse gets away") {
            var which = catAndMouse(1,3,2)
            assertEquals("Mouse C",which)
        }
    }
})
