package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class SpaceStationSpek: Spek({
    describe("Determines the max distance from any city to nearest space station") {
        it("calculates 2") {
            var result = flatlandSpaceStations(5,arrayOf(0,4))
            var expected = 2
            assertEquals(expected,result)
        }
        it("calculates 0") {
            var result = flatlandSpaceStations(6,arrayOf(0,1,2,4,3,5))
            var expected = 0
            assertEquals(expected,result)
        }
    }
})
