package hacker.solutionk

import hacker.solutionk.MyDate
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(FileWriter("dates.txt"))

    val firstMultipleInput =
        bufferedReader.readLine().replace("\\s+$".toRegex(), "").split(" ".toRegex()).dropLastWhile { it.isEmpty() }
            .toTypedArray()

    val month = Integer.parseInt(firstMultipleInput[0])

    val day = Integer.parseInt(firstMultipleInput[1])

    val year = Integer.parseInt(firstMultipleInput[2])

    val res = MyDate.findDay(month, day, year)

    bufferedWriter.write(res)
    bufferedWriter.newLine()

    bufferedReader.close()
    bufferedWriter.close()

}