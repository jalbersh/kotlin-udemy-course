package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class TaumBdaySpek: Spek({
    describe("Determines minimum cost of gifts") {
        it("calculates 20") {
            var result = taumBday(10,10,1,1,1)
            var expected = BigInteger("20")
            assertEquals(expected,result)
        }
        it("calculates 37") {
            var result = taumBday(5,9,2,3,4)
            var expected = BigInteger("37")
            assertEquals(expected,result)
        }
        it("calculates 12") {
            var result = taumBday(3,6,9,1,1)
            var expected = BigInteger("12")
            assertEquals(expected,result)
        }
        it("calculates 35") {
            var result = taumBday(7,7,4,2,1)
            var expected = BigInteger("35")
            assertEquals(expected,result)
        }
        it("calculates 12 again") {
            var result = taumBday(3,3,1,9,2)
            var expected = BigInteger("12")
            assertEquals(expected,result)
        }
        it("calculates 18192035842") {
            var result = taumBday(27984, 1402,619246, 615589, 247954)
            var expected = BigInteger("18192035842")
            assertEquals(expected,result)
        }
    }
})
/*
10
27984 1402
619246 615589 247954
95677 39394
86983 311224 588538
68406 12718
532909 315341 201009
15242 95521
712721 628729 396706
21988 67781
645748 353796 333199
22952 80129
502975 175136 340236
38577 3120
541637 657823 735060
5943 69851
674453 392925 381074
62990 61330
310144 312251 93023
11152 43844

18192035842
20582630747
39331944938
70920116291
38179353700
25577754744
22947138309
31454478354
38686324390
18609275504
 */