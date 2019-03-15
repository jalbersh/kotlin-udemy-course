package hacker.solutionk

import hacker.solutionk.FamilyBudget
import hacker.solutionk.FamilyMember
import java.lang.reflect.Method
import java.util.Scanner

object Annotation {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var testCases = Integer.parseInt(`in`.nextLine())
        while (testCases > 0) {
            val role = `in`.next()
            val spend = `in`.nextInt()
            try {
                val annotatedClass = FamilyMember::class.javaObjectType
                val methods = annotatedClass.methods
                for (method in methods) {
                    if (method.isAnnotationPresent(FamilyBudget::class.javaObjectType)) {
                        val family = method
                            .getAnnotation(FamilyBudget::class.javaObjectType)
                        val userRole = family.userRole
                        val budgetLimit = family.budgetLimit
                        if (userRole == role) {
                            if (spend <= budgetLimit) {
                                method.invoke(
                                    FamilyMember::class.javaObjectType.newInstance(),
                                    budgetLimit, spend
                                )
                            } else {
                                println("Budget Limit Over")
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            testCases--
        }
    }
}
