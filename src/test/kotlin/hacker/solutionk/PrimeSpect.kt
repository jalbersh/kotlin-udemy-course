package hacker.solutionk

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertFails

class PrimeSpec: Spek({
    describe("Check isPrime") {
        val prime: Prime = Prime()
        it("returns true for primes") {
            assertTrue( prime.isPrime(47))
            assertTrue( prime.isPrime(2))
        }
        it ("returns false for non-prime") {
            assertFalse( prime.isPrime(49))
            assertFalse( prime.isPrime(1))
        }
    }
})


