package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class CamelCaseSpek: Spek({
    describe("Determines the number of words") {
        it("returns 3") {
            var result = camelcase("oneTwoThree")
            var expected = 3
            assertEquals(expected,result)
        }
        it("returns 5") {
            var result = camelcase("saveChangesInTheEditor")
            var expected = 5
            assertEquals(expected,result)
        }
        it("returns 8") {
            var result = camelcase("saveChangesInTheEditorToBeSafe")
            var expected = 8
            assertEquals(expected,result)
        }
    }
})
