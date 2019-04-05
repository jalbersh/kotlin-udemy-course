package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class CaesarCipherSpek: Spek({
    describe("Determines the Acm numbers") {
        it("calculates cipher") {
            var result = caesarCipher("middle-Outz",2)
            var expected = "okffng-Qwvb"
            assertEquals(expected,result)
        }
        it("calculates entire alphabet") {
            var result = caesarCipher("abcdefghijklmnopqrstuvwxyz",3)
            var expected = "defghijklmnopqrstuvwxyzabc"
            assertEquals(expected,result)
        }
    }
})
