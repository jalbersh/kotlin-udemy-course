package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class CountingValleysSpek: Spek({
    describe("Determines the numebr of valleys entered") {
        it("has 1 valley with 4 Ds") {
            var valleys = countingValleys(8,"UDDDUDUU")
            assertEquals(1,valleys)
        }
        it("has 1 valley with 4 Us") {
            var valleys = countingValleys(8,"DDUUUUDD")
            assertEquals(1,valleys)
        }
        it("has 1 valley with alternating UDs") {
            var valleys = countingValleys(8,"UDDDUDUU")
            assertEquals(1,valleys)
        }
    }
})
