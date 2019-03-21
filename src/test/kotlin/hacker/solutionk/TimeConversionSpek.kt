package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class TimeConversionSpek: Spek({
    describe("Convert 12-hour time to 24-hour time") {
        it("converts less then Noon") {
            var time24 = timeConversion("09:04:35AM")
            assertEquals("09:04:35",time24)
        }
        it("converts noon") {
            var time24 = timeConversion("12:05:03PM")
            assertEquals("12:05:03",time24)
        }
        it("converts greater than noon") {
            var time24 = timeConversion("02:04:05PM")
            assertEquals("14:04:05",time24)
        }
        it("handles times just after midnight") {
            var time24 = timeConversion("12:03:05AM")
            assertEquals("00:03:05",time24)
        }
    }
})
