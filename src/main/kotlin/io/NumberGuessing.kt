package io

import java.util.*

fun main(args: Array<String>) {
    val number: Int = Random().nextInt(100)+1
    var guess: Int = -1
    var input: String?

    while (guess != number) {
        print("Guess a number between 1 and 100: ")
        input = readLine()
        if (input != null) {
            guess = input.toInt()
        }
        if (guess < number) {
            println("too low");
        } else if (guess > number) {
            println("too high")
        } else {
            println("You won!")
        }
    }
}