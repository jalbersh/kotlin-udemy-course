package hacker.solutionk

import java.util.*

fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */
    var parts = s.split(":")
    var hour = Integer.parseInt(parts[0])
    var mins = Integer.parseInt(parts[1])
    var index = parts[2].indexOf("M")
    var secs = parts[2].substring(0,index-1)
    var AMorPM = parts[2].substring(index-1)
    if (AMorPM.equals("PM") && hour != 12) hour += 12;
    if (AMorPM.equals("AM") && hour == 12) hour = 0;
    var shour = hour.toString().padStart(2,'0')
    var smins = mins.toString().padStart(2,'0')
    var ssecs = secs.toString().padStart(2,'0')
    return "$shour:$smins:$ssecs"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}

/*
Output Format

Convert and print the given time in -hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45
 */