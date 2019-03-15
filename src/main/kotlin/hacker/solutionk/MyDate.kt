package hacker.solutionk

import java.time.DayOfWeek
import java.time.LocalDate

object MyDate {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    fun findDay(month: Int, day: Int, year: Int): String {
        val date = LocalDate.of(year, month, day)
        val dayOfWeek = date.dayOfWeek

        return dayOfWeek.name
    }
}

