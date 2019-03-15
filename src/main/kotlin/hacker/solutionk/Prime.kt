package hacker.solutionk

class Prime {
    fun checkPrime(vararg values: Int) {
        var flag = false
        for (value in values) {
            for (i in 2..value / 2) {
                if (value % i == 0) {
                    flag = true
                    break
                }
            }
            if (!flag && value != 1)
                println(value)
        }
    }
}
