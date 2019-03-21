package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class SockMerchantSpek: Spek({
    describe("Determines how many pairs of like-colored sockets are in pile") {
        it("shows there are 2 pairs") {
            var socks = arrayOf(1,2,1,2,1,3,2)
            var pairs = sockMerchant(7,socks)
            assertEquals(2,pairs)
        }
        it("shows there are three pairs") {
            var socks = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
            var pairs = sockMerchant(9,socks)
            assertEquals(3,pairs)
        }
        it("shows there are three pairs") {
            var socks = arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3)
            var pairs = sockMerchant(10,socks)
            assertEquals(4,pairs)
        }
    }
})
