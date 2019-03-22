package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class UtopianTreeSpek: Spek({
    describe("Determines the height of a given tree") {
        var height = 0;
        it("returns the height for 4 growth periods") {
            height = utopianTree(4)
            assertEquals(7,height)
        }
        it("returns the height for 1 growth period") {
            height = utopianTree(1)
            assertEquals(2,height)
        }
        it("returns the height for 0 growth period") {
            height = utopianTree(0)
            assertEquals(1,height)
        }
        it("returns the height for 2 growth period") {
            height = utopianTree(2)
            assertEquals(3,height)
        }
        it("returns the height for 3 growth period") {
            height = utopianTree(3)
            assertEquals(6,height)
        }
        it("returns the height for 5 growth period") {
            height = utopianTree(5)
            assertEquals(14,height)
        }
    }
})
