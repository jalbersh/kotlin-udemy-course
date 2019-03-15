package hacker.solutionk

object InheritanceDemo2 {
    @JvmStatic
    fun main(args: Array<String>) {
        // Create a new Adder object
        val a = Adder()

        // Print the name of the superclass on a new line
        println("My superclass is: " + a.javaClass.superclass.name)

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        print(a.add(10, 32).toString() + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n")
    }
}