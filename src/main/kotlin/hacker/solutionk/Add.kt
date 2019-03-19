package hacker.solutionk

class Add {
    fun add(vararg values: Int): Int {
        var sum = 0
        var i = 0
        for (value in values) {
            if (i > 0) print("+")
            print(value)
            sum += value
            i++
        }
        println("=$sum")
        return sum
    }
}
