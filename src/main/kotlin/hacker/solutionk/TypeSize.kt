package hacker.solutionk

import java.util.*

fun fitIn(s: String) {
    try {
        val l = java.lang.Long.parseLong(s)
        System.out.printf("%d can be fitted in:\n", l)
        try {
            java.lang.Byte.parseByte(s);
            println("* byte")
        } catch (e1: NumberFormatException) {}
        try {
            java.lang.Short.parseShort(s);
            println("* short")
        } catch (e1: NumberFormatException) {}
        try {
            java.lang.Integer.parseInt(s);
            println("* int")
        } catch (e1: NumberFormatException) {}
        println("* long")
    } catch (e: NumberFormatException) {
        System.out.printf("%s can't be fitted anywhere.\n", s)
    }

}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s1 = sc.nextLine()
    var j = 0
    try {
        j = Integer.parseInt(s1)
    } catch (e: NumberFormatException) {
        System.exit(0)
    }

    for (i in 0 until j) {
        val s = sc.nextLine()
        fitIn(s)
    }
    sc.close()
}
