package hacker.solutionk

import java.io.*
import java.math.*
import java.security.*
import java.text.*
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

// Complete the howManyGames function below.
fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    var games = 0
    var money = s
    var price = p
    while (money >= price) {
        if (games == 0) {
            money -= price
            price = if (price - d >= m) price - d else m
        } else {
            money -= price
            price = if (price - d >= m) price - d else m
        }
        games++
    }
    return games
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val pdms = scan.nextLine().split(" ")

    val p = pdms[0].trim().toInt()

    val d = pdms[1].trim().toInt()

    val m = pdms[2].trim().toInt()

    val s = pdms[3].trim().toInt()

    val answer = howManyGames(p, d, m, s)

    println(answer)
}
