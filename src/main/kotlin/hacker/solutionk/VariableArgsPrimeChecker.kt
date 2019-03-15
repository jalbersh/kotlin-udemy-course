package hacker.solutionk

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.HashSet

object VariableArgsPrimeChecker {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val n1 = Integer.parseInt(br.readLine())
            val n2 = Integer.parseInt(br.readLine())
            val n3 = Integer.parseInt(br.readLine())
            val n4 = Integer.parseInt(br.readLine())
            val n5 = Integer.parseInt(br.readLine())
            val ob = Prime()
            ob.checkPrime(n1)
            ob.checkPrime(n1, n2)
            ob.checkPrime(n1, n2, n3)
            ob.checkPrime(n1, n2, n3, n4, n5)
            val methods = Prime::class.java.declaredMethods
            val set = HashSet<String>()
            var overload = false
            for (i in methods.indices) {
                if (set.contains(methods[i].name)) {
                    overload = true
                    break
                }
                set.add(methods[i].name)

            }
            if (overload) {
                throw Exception("Overloading not allowed")
            }
        } catch (e: Exception) {
            println(e)
        }

    }
}
