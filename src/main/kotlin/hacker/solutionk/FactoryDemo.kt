package hacker.solutionk

import java.security.Permission
import java.util.Scanner

internal interface Food {
    val type: String
}

internal class Pizza : Food {
    override val type: String
        get() = "Pizza, Pizza!"
}

internal class Cake : Food {
    override val type: String
        get() = "Let them eat cake!"
}
internal class FoodFactory {
    fun getFood(order: String): Food? {
        return if (order.equals("pizza"))
            Pizza()
        else if (order.equals("cake"))
            Cake()
        else
            null
    }
}
object FactoryDemo {
    @JvmStatic
    fun main(args: Array<String>) {
//        DoNotTerminate.forbidExit()
//        try {
            val sc = Scanner(System.`in`)
            //creating the factory
            val foodFactory = FoodFactory()

            //factory instantiates an object
            val food = foodFactory.getFood(sc.nextLine())


            println("The factory returned " + food!!.javaClass)
            println(food.type)
//        } catch (e: DoNotTerminate.ExitTrappedException) {
//            println("Unsuccessful Termination!!")
//        }

    }
}

internal object DoNotTerminate {
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