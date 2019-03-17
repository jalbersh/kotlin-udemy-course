package hacker.solutionk

import java.io.BufferedReader
import java.io.InputStreamReader
import java.security.Permission

object AccessDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        DoNotTerminate().forbidExit()
        try {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val num = Integer.parseInt(br.readLine().trim { it <= ' ' })
            var o: Any// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            //Write your code here
            o = Any()
            val instance = AccessDemo.Inner()
//            val inner = instance.Private()
//            o = inner
//            println(num.toString() + " is " + inner.powerof2(num))
            println("An instance of class: " + o.javaClass.canonicalName + " has been created")
        }//end of try
        catch (e: DoNotTerminate.ExitTrappedException) {
            println("Unsuccessful Termination!!")
        }
    }//end of main

    internal class Inner {
        private inner class Private {
            private fun powerof2(num: Int): String {
                return if (num and num - 1 == 0) "power of 2" else "not a power of 2"
            }
        }
    }//end of Inner
    internal class DoNotTerminate { //This class prevents exit(0)

        class ExitTrappedException : SecurityException() {
            companion object {
                private val serialVersionUID = 1L
            }
        }
        fun forbidExit() {
            val securityManager = object : SecurityManager() {
                override fun checkPermission(permission: Permission) {
                    if (permission.name.contains("exitVM")) {
                        throw ExitTrappedException()
                    }
                }
            }
            System.setSecurityManager(securityManager)
        }
    }
}
