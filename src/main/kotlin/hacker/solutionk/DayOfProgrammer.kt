package hacker.solutionk

import sun.util.calendar.JulianCalendar
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.time.LocalDate
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the dayOfProgrammer(Russian Calendar) function below.
fun dayOfProgrammer(year: Int): String {
    val afterFeb = 31+30+31+30+31+31
    var toFeb = 31+28
    if (year < 1918) {
        // Use Julian Calendar
        var count = afterFeb+toFeb
        if (year % 4 == 0) count += 1
        var dayNum = 256-count
        return dayNum.toString().padStart(2,'0')+"."+"09."+year.toString()
    } else if (year > 1918) {
        // use Gregorian Calendar
        val date = LocalDate.ofYearDay(year,256)
        return date.dayOfMonth.toString().padStart(2,'0')+"."+date.monthValue.toString().padStart(2,'0')+"."+date.year.toString()
    } else {
        // use adjustement: day after Jan 31 was Feb 14 (32 day of year)
        var count = afterFeb+31+14+1
        var dayNum = 256-count
        return dayNum.toString().padStart(2,'0')+"."+"09."+year.toString()
    }
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
