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

// Complete the queensAttack function below.
fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
/*
- n: an integer, the number of rows and columns in the board
- k: an integer, the number of obstacles on the board
- r_q: integer, the row number of the queen's position
- c_q: integer, the column number of the queen's position
- obstacles: a two dimensional array of integers where each element is an array of  integers, the row and column of an obstacle
 */
    var blockers = Array(n){Array(n){0}}
    for (row in 1..n) {
        for (col in 1..n) {
            if (k > 0) {
                for (or in 0..obstacles.size - 1) {
                    if (obstacles[or][0] == row && obstacles[or][1] == col) {
                        blockers[row - 1][col - 1] = 1
                        if (row == r_q) {
                            if (c_q < col) {
                                for (c in col..n) {
                                    blockers[row - 1][c - 1] = 1
                                }
                            } else {
                                for (c in 1..col) {
                                    blockers[row - 1][c - 1] = 1
                                }
                            }
                        } else if (col == c_q) {
                            if (r_q < row) {
                                for (r in row..n) {
                                    blockers[r - 1][col - 1] = 1
                                }
                            } else {
                                for (r in 1..row) {
                                    blockers[r - 1][col - 1] = 1
                                }
                            }
                        } else {
                            for (r in 1..n) {
                                if (row + r == r_q && col + r == c_q) {
                                    blockers[row + r-1][col + r-1] = 1
                                } else if (row - r == r_q && col - r == c_q) {
                                    blockers[row - r-1][col - r-1] = 1
                                } else if (row + r == r_q && col - r == c_q) {
                                    blockers[row+r-1][col-r-1] = 1
                                } else if (row - r == r_q && col + r == c_q) {
                                    blockers[row-r-1][col+r-1] = 1
                                }
                            }
                        }
                    }
                    else blockers[row-1][col-1] = 0
                }
            } else {
                blockers[row-1][col-1] = 0
            }
        }
    }
    var count=0;
    // horizontal +/-
    for (col in 1..n) {
        // if not in obstacles
        if (col != c_q) {
            if (blockers[r_q-1][col-1] == 0) count++
        }
    }
    // vertical +/-
    for (row in 1..n) {
        // if not in obstacles
        if (row != r_q) {
            if (blockers[row-1][c_q-1] == 0) count++
        }
    }
    // diagonal lower right - upper left
    for (i in r_q+1..n) {
        for (j in c_q+1..n) {
            if (j-c_q == i-r_q) {
                if (i != r_q && j != c_q) {
                    if (blockers[i - 1][j - 1] == 0) count++
                }
            }
        }
    }
    for (i in 1..r_q-1) {
        for (j in 1..c_q-1) {
            if (c_q-j == r_q-i) {
                if (i != r_q && j != c_q) {
                    if (blockers[i - 1][j - 1] == 0) count++
                }
            }
        }
    }
    // diagonal upper right - lower left
    for (i in r_q+1..n) {
        for (j in 1..c_q-1) {
            if (i-r_q == c_q-j)
            if (i != r_q && j != c_q) {
                if (blockers[i-1][j-1] == 0) count++
            }
        }
    }
    for (i in 1..r_q-1) {
        for (j in c_q+1..n) {
            if (r_q-i == j-c_q) {
                if (i != r_q && j != c_q) {
                    if (blockers[i - 1][j - 1] == 0) count++
                }
            }
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val r_qC_q = scan.nextLine().split(" ")

    val r_q = r_qC_q[0].trim().toInt()

    val c_q = r_qC_q[1].trim().toInt()

    val obstacles = Array<Array<Int>>(k, { Array<Int>(2, { 0 }) })

    for (i in 0 until k) {
        obstacles[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = queensAttack(n, k, r_q, c_q, obstacles)

    println(result)
}