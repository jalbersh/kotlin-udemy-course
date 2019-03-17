package hacker.solutionk

class Prime {
    fun checkPrime(vararg numbers: Int) {
        for (num in numbers) {
            if (isPrime(num)) {
                print("$num ")
            }
        }
        println()
    }
    fun isPrime(n: Int): Boolean {
        if (n < 2) {
            return false
        } else if (n == 2) {
            return true
        } else if (n % 2 == 0) {
            return false
        }
        val sqrt = Math.sqrt(n.toDouble()).toInt()
        var i = 3
        while (i <= sqrt) {
            if (n % i == 0) {
                return false
            }
            i += 2
        }
        return true
    }
}
