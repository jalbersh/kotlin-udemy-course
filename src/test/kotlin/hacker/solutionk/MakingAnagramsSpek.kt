package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class MakingAnagramsSpek: Spek({
    describe("Determines the number of deletions until strings are anagrams") {
        it("calculates 4") {
            var result = makingAnagrams("cde","abc")
            var expected = 4
            assertEquals(expected,result)
        }
        it("calculates 6") {
            var result = makingAnagrams("abc","amnop")
            var expected = 6
            assertEquals(expected,result)
        }
        it("calculates 19") {
            var result = makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj","djfladfhiawasdkjvalskufhafablsdkashlahdfa")
            var expected = 19
            assertEquals(expected,result)
        }
        it("calculates 30") {
            var result = makingAnagrams("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke")
            var expected = 30
            assertEquals(expected,result)
        }
    }
})
