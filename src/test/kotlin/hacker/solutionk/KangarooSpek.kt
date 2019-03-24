package hacker.solutionk

import hacker.solutionk.Solution.getNextMultipleOf5
import hacker.solutionk.Solution.gradingStudents
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class KangarooSpek: Spek({
    describe( "Determines if Kangaroos meet") {
        it ("returns yes") {
            var result = kangaroo(0, 3, 4, 2)
            assertEquals("YES", result)
        }
        it("returns no") {
            var result = kangaroo(0, 2, 5, 3)
            assertEquals("NO",result)
        }
        it("returns no for failed case") {
            var result = kangaroo(21, 6, 47, 3)
            assertEquals("NO", result)
        }
    }
})
