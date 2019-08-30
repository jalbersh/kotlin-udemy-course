package hacker.solutionk

import java.util.*
import java.util.Arrays



object ListDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        var N = scan.nextInt()
        var list = ArrayList<Integer>(N)
        for (i in 0 until N) list.add(Integer(scan.nextInt()))
        var Q = scan.nextInt()
        for (i in 0 until Q) {
            val command = scan.next()
            if (command.equals("Insert")) {
                val position = scan.nextInt()
                val y = scan.nextInt()
                list.add(position,Integer(y))
            } else {
                val position = scan.nextInt()
                list.removeAt(position)
            }
        }
        scan.close()
        list.stream().forEach {it -> print(it.toString()+" ")}
    }
}