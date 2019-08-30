package hacker.solutionk

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertFails
import kotlin.test.assertEquals

class SherlockSpec: Spek({
    describe("Check If Valid") {
        it("returns NO") {
            assertEquals(sherlockIsValid("aabbcd"),"NO")
        }
        it("returns NO again") {
            assertEquals(sherlockIsValid("aabbccddeefghi"), "NO")
        }
        it("returns YES") {
            assertEquals(sherlockIsValid("abcdefghhgfedecba"), "YES")
        }
    }
})