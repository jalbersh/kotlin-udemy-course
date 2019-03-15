package hacker.solutionk

fun main(args: Array<String>) {
    val myPrinter = Printer()
    val intArray = arrayOf(1, 2, 3)
    val stringArray = arrayOf("Hello", "World")
    myPrinter.printArray<Int>(intArray)
    myPrinter.printArray<String>(stringArray)
    var count = 0

    for (method in Printer::class.java.declaredMethods) {
        val name = method.name

        if (name == "printArray")
            count++
    }

    if (count > 1) println("Method overloading is not allowed!")
}