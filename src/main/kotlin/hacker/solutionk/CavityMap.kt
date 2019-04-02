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

// Complete the cavityMap function below.
fun isEdge(i: Int, j: Int, grid: Array<String>): Boolean {
    if (i == 0 || i == grid.size-1) return true
    if (j==0 || j == grid[i].length-1) return true
    return false
}
fun isCavity(i: Int, j: Int, grid:Array<String>): Boolean {
    val value = grid[i][j].toInt()
    val s = grid[i]
    val above = grid[i-1]
    val below = grid[i+1]
    if (s[j-1].toInt() >= value) return false
    if (s[j+1].toInt() >= value) return false
    if (above[j].toInt() >= value) return false
    if (below[j].toInt() >= value) return false
    return true
}
fun cavityMap(grid: Array<String>): Array<String> {
    var out = Array<String>(grid.size,{""})
    for (i in 0 until grid.size) {
        var line = grid[i]
        for (j in 0 until line.length) {
            if (!isEdge(i,j,grid) && isCavity(i,j,grid)) {
                out[i] += "X"
            } else {
                out[i] += line.substring(j,j+1)
            }
        }
    }
    return out
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grid = Array<String>(n, { "" })
    for (i in 0 until n) {
        val gridItem = scan.nextLine()
        grid[i] = gridItem
    }

    val result = cavityMap(grid)

    println(result.joinToString("\n"))
}
