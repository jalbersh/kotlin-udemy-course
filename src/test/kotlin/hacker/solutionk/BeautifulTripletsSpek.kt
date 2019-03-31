package hacker.solutionk

import hacker.solutionk.Solution.getNextMultipleOf5
import hacker.solutionk.Solution.gradingStudents
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class BeautifulTripletsSpek: Spek({
    describe( "Determine beautiful triplets") {
        it ("returns 3") {
            var result = beautifulTriplets(3,arrayOf(1, 2, 4, 5, 7, 8, 10))
            assertEquals(3, result)
        }
    }
})
