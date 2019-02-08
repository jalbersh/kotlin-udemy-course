package functions

import java.util.*

fun getCurrentDate(): Date {
    return Date()
}
fun reverse(list: List<Int>):List<Int> {
    var revList = arrayListOf<Int>()
    for (i in 0..list.size-1) {
        revList.add(list.get(list.size-1-i))
    }
    return revList
}
fun reverse2(list: List<Int>):List<Int> {
    var revList = arrayListOf<Int>()
    for (i in list.size-1 downTo 0) {
        revList.add(list.get(i))
    }
    return revList
}
fun main(args: Array<String>) {
    println(getCurrentDate())
    println()
    println(reverse(listOf(1,3,5,6,8,9)))
    println(reverse2(listOf(1,3,5,6,8,9)))
}