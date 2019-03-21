package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class DayOfProgrammerSpek: Spek({
    describe("Determines 256th day of given year") {
        it("calculates the date in 1800") {
            var date = dayOfProgrammer(1800)
            assertEquals("13.09.1800",date)
        }
        it("calculates the date in 2016") {
            var date = dayOfProgrammer(2016)
            assertEquals("12.09.2016",date)
        }
        it("calculates the date in 2017") {
            var date = dayOfProgrammer(2017)
            assertEquals("13.09.2017",date)
        }
        it("calculates the date in 1984") {
            var date = dayOfProgrammer(1984)
            assertEquals("12.09.1984",date)
        }
        it("calculates the date in 1918") {
            var date = dayOfProgrammer(1918)
            assertEquals("26.09.1918",date)
        }
        it("calculates the date in 1917") {
            var date = dayOfProgrammer(1917)
            assertEquals("12.09.1984",date)
        }
    }
})
