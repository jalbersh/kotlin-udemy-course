package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class TwoCharactersSpek: Spek({
    describe("counting sort") {
        it("returns 5") {
            var result = alternate("beabeefeab")
            var expected = 5
            assertEquals(expected,result)
        }
        it( "returns 4") {
            var result = alternate("abaacdabd")
            var expected = 4
            assertEquals(expected,result)
        }
    }
})
