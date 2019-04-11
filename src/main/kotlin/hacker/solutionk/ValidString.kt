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
import sun.tools.jstat.Alignment.keySet



// Complete the isValid function below.
fun isValid(s: String): String {
    var map = HashMap<Char,Int>()
    if (s.length == 1) return "YES"
    for (i in s) {
        if (!map.contains(i)) {
            map.set(i,1)
        } else {
            var freq = map.get(i)
            if (freq != null) {
                map.set(i, freq+1)
            }
        }
    }
    if (map.keys.size == 1) return "YES"
    var max = map.values.max()
    var min = map.values.min()
    var numMax = map.values.count { it -> it==max }
    var numMin = map.values.count { it -> it==min }
    if (numMin == 1 && numMax == map.values.size-1) return "YES"
    if (numMax > 1) return "NO"
    if (min != null) {
        if (max != min+1) return "NO"
    }
    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = isValid(s)

    println(result)
}
