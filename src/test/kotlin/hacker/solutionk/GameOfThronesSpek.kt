package hacker.solutionk

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertFails
import kotlin.test.assertEquals

class GameOfThronesSpec: Spek({
    describe("Check Good Anagram") {
        it("returns YES") {
            assertEquals(gameOfThrones("xyyx"),"YES")
        }
        it("returns NO again") {
            assertEquals(gameOfThrones("cdcdcdcdeeeef"), "YES")
        }
        it("returns NO") {
            assertEquals(gameOfThrones("cdefghmnopqrstuvw"), "NO")
        }
    }
})