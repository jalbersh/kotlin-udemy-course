package hacker.solutionk

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var c = arrayOf(0,0)
    var alice: Int = 0
    var bob: Int = 0
    for (i in 0 until a.size) {
        if (a[i] > b[i]) alice += 1
        if (b[i] > a[i]) bob += 1
    }
    c[0] = alice
    c[1] = bob
    return c
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}