package hacker.solutionk

public class Printer {
    fun <T> printArray(array: Array<T>) {
        for (element in array) {
            println(element)
        }
    }
}