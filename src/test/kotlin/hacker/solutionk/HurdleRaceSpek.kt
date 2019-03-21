package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class HurdleRaceSpek: Spek({
    describe("Determine minimum dose to clear hurdles") {
        it("Clears on 2 doses") {
            var dose = hurdleRace(4,arrayOf(1,6,3,5,2))
            assertEquals(2,dose)
        }
//        it("Cat A gets the mouse") {
//            var max = getMoneySpent(arrayOf(4),arrayOf(5), 4)
//            assertEquals(-1,max)
//        }
        it("clears everything with no does") {
            var dose = hurdleRace(7,arrayOf(2,5,4,5,2))
            assertEquals(0,dose)
        }
    }
})
