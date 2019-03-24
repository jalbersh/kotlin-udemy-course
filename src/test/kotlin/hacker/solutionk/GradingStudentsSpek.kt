package hacker.solutionk

import hacker.solutionk.Solution.getNextMultipleOf5
import hacker.solutionk.Solution.gradingStudents
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class GradingStudentsSpek: Spek({
    describe( "Determine next rounding grade") {
        it ("returns grade rounded to next 5 if within 3") {
            var rounded = getNextMultipleOf5(73)
            assertEquals(75, rounded)
        }
    }
    describe("Determine the rounded grades") {
        it("has 1 turns from end (opposite)") {
            var grades = gradingStudents(arrayOf(73,67,38,33))
            assertEquals(arrayOf(75,67,40,33),grades)
        }
    }
})
