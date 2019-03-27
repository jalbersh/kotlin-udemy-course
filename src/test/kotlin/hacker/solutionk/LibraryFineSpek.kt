package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class LibraryFineSpek: Spek({
    describe("Determines the number of elements in subarray") {
        it("calculates same month") {
            var result = libraryFine(9,6,2015,6,6,2015)
            var expected = 45
            assertEquals(expected,result)
        }
        it("calculates different year") {
            var result = libraryFine(31,12,2018,1,1,2019)
            var expected = 10000
            assertEquals(expected,result)
        }
        it("calculates not yet due") {
            var result = libraryFine(6,6,2015,9,6,2015)
            var expected = 45
            assertEquals(expected,result)
        }
    }
})
