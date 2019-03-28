package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class EncryptionSpek: Spek({
    describe("Determines the encrypted string") {
        it("calculates if man was meant to stay on the ground god would have given us roots") {
            var result = encryption("if man was meant to stay on the ground god would have given us roots")
            var expected = "ifmanwas meanttos tayonthe groundgo dwouldha vegivenu sroots"
            assertEquals(expected,result)
        }
        it("calculates haveaniceday") {
            var result = encryption("haveaniceday")
            var expected = "hae and via ecy"
            assertEquals(expected,result)
        }
        it("calculates chillout") {
            var result = encryption("chillout")
            var expected = "clu hlt io"
            assertEquals(expected,result)
        }
        it("calculates feedthedog") {
            var result = encryption("feedthedog")
            var expected = "fto ehg ee dd"
            assertEquals(expected,result)
        }
    }
})
