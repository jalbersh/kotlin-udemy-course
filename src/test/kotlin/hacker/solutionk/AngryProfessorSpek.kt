package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AngryProfessorSpek: Spek({
    describe("Determines if class is cancelled") {
        it("Needs 3 students, only has 2 ontime") {
            var cancel = angryProfessor(3,arrayOf(-1,-3,4,2))
            assertTrue("YES".equals(cancel))
        }
        it("Needs 2, has 3 ontime") {
            var cancel = angryProfessor(2,arrayOf(0,-1,2,1))
            assertTrue("NO".equals(cancel))
        }
    }
})
