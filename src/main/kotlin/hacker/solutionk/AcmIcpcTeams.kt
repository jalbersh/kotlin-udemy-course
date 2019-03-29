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

// Complete the acmTeam function below.
fun acmTeam(topic: Array<String>): Array<Int> {
    var max = 0
    var knows = 0
    for (i in 0 until topic.size-1) {
        for (j in i + 1 until topic.size) {
            var known = 0
            for (k in 0 until topic[0].length) {
                if (topic[i][k] === '1' || topic[j][k] === '1')
                    known++
                if (max < known) {
                    max = known
                    knows = 0
                }
                if (known == max)
                    knows++
            }
        }
    }
    var list = ArrayList<Int>()
    list.add(max)
    println(max)
    list.add(knows)
    println(knows)
    return(list.toTypedArray())
}
fun acmTeam1(topic: Array<String>): Array<Int> {
    var list = ArrayList<Int>()
    var max = 0;
    for (t in 0..topic.size-1) {
        for (s in 1..topic.size-1) {
            var bin = convertDecimalToBinary(topic[t].toInt(2) or topic[s].toInt(2)).toString()
            var count=0
            for (i in 0..bin.length-1) {
                if (bin[i] == '1') count++
            }
            if (count>max) max=count
        }
    }
    var teams=0
    var map = HashMap<Int,Int>(topic.size)
    for (t in 0..topic.size-1) {
        for (s in 1..topic.size-1) {
            var bin = convertDecimalToBinary(topic[t].toInt(2) or topic[s].toInt(2)).toString()
            var count=0
            for (i in 0..bin.length-1) {
                if (bin[i] == '1') count++
            }
            if (count==max) {
                if (!map.contains(t) && (!map.contains(s))) {
                    teams++
                    map.set(t, s)
                }
            }
        }
    }
    list.add(max)
    println(max)
    list.add(teams)
    println(teams)
    return list.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val topic = Array<String>(n, { "" })
    for (i in 0 until n) {
        val topicItem = scan.nextLine()
        topic[i] = topicItem
    }

    val result = acmTeam(topic)

    println(result.joinToString("\n"))
}
