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

// Complete the insertionSort function below.
private var count: Int = 0

fun insertionSort5(arr: Array<Int>): Int {
    // Complete this function
    count = 0
    var helper = arrayOfNulls<Int>(arr.size)
    mergeSort(arr, 0, arr.size - 1, arr)
    return count
}

private fun mergeSort(arr: Array<Int>, left: Int, right: Int, helper: Array<Int>) {
    if (left == right) return

    val mid = left + (right - left) / 2
    mergeSort(arr, left, mid, helper)
    mergeSort(arr, mid + 1, right, helper)
    merge(arr, left, right, mid, helper)
}

private fun merge(arr: Array<Int>, left: Int, right: Int, mid: Int, helper: Array<Int>) {
    var left = left
    for (i in left..right) {
        helper[i] = arr[i]
    }
    var leftInd = left
    var rightInd = mid + 1
    while (leftInd <= mid && rightInd <= right) {
        if (helper[leftInd] <= helper[rightInd]) {
            arr[left++] = helper[leftInd++]
            count += (left - leftInd).toInt()
        } else {
            arr[left++] = helper[rightInd++]
        }
    }

    while (leftInd <= mid) {
        arr[left++] = helper[leftInd++]
        count += (left - leftInd).toInt()
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = insertionSort5(arr)

        println(result)
    }
}
