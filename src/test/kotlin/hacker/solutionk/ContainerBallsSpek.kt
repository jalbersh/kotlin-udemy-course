package hacker.solutionk

import hacker.solutionk.Solution.getNextMultipleOf5
import hacker.solutionk.Solution.gradingStudents
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class ContainerBallsSpek: Spek({
    describe( "Determine ball movement") {
        it ("returns impossible") {
            var result = organizingContainers(arrayOf(arrayOf(1, 3, 1), arrayOf(2, 1, 2), arrayOf(3, 3, 3)))
            assertEquals("impossible", result)
        }
        it("returns possible") {
            var result = organizingContainers(arrayOf(arrayOf(0, 2, 1), arrayOf(1, 1, 1), arrayOf(2, 0, 0)))
            assertEquals("possible",result)
        }
    }
})
