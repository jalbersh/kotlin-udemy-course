package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class HackerrankInStringSpek: Spek({
    describe("Determines if hackerrank in string") {
        it("calculates YES") {
            var result = hackerrankInString("hhaacckkekraraannk")
            var expected = "YES"
            assertEquals(expected,result)
        }
        it("calculates NO1") {
            var result = hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt")
            var expected = "NO"
            assertEquals(expected,result)
        }
        it("calculates NO2") {
            var result = hackerrankInString("knarrekcah")
            var expected = "NO"
            assertEquals(expected,result)
        }
        it("calculates YES2") {
            var result = hackerrankInString("hackerrank")
            var expected = "YES"
            assertEquals(expected,result)
        }
        it("calculates NO3") {
            var result = hackerrankInString("hackeronek")
            var expected = "NO"
            assertEquals(expected,result)
        }
        it("calculates NO4") {
            var result = hackerrankInString("abcdefghijklmnopqrstuvwxyz")
            var expected = "NO"
            assertEquals(expected,result)
        }
        it("calculates NO4") {
            var result = hackerrankInString("rhackerank")
            var expected = "NO"
            assertEquals(expected,result)
        }
        it("calculates NO6") {
            var result = hackerrankInString("ahankercka")
            var expected = "NO"
            assertEquals(expected,result)
        }
        it("calculates YES3") {
            var result = hackerrankInString("hacakaeararanaka")
            var expected = "YES"
            assertEquals(expected,result)
        }
        it("calculates YES4") {
            var result = hackerrankInString("hhhhaaaaackkkkerrrrrrrrank")
            var expected = "YES"
            assertEquals(expected,result)
        }
        it("calculates NO7") {
            var result = hackerrankInString("crackerhackerknar")
            var expected = "NO"
            assertEquals(expected,result)
        }
        it("calculates NO8") {
            var result = hackerrankInString("hhhackkerbanker")
            var expected = "NO"
            assertEquals(expected,result)
        }
    }
})
/*










 */