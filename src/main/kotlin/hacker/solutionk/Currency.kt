package hacker.solutionk

import java.text.NumberFormat
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val payment = scanner.nextDouble()
    scanner.close()

    // Write your code here.
    val usLocale = Locale.US
    val usFormat = NumberFormat.getCurrencyInstance(usLocale)
    val us = usFormat.format(payment)

    val inLocale = Locale("en", "IN")
    val inFormat = NumberFormat.getCurrencyInstance(inLocale)
    val india = inFormat.format(payment)

    val chLocale = Locale.CHINA
    val chFormat = NumberFormat.getCurrencyInstance(chLocale)
    val china = chFormat.format(payment)

    val frLocale = Locale.FRANCE
    val frFormat = NumberFormat.getCurrencyInstance(frLocale)
    val france = frFormat.format(payment)

    println("US: $us")
    println("India: $india")
    println("China: $china")
    println("France: $france")
}
