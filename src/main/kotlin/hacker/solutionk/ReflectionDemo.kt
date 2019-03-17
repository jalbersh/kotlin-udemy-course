package hacker.solutionk

import java.util.*

object ReflectionDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val student = Student::class.java
        val methods = student.declaredMethods

        val methodList = ArrayList<String>()
        for (method in methods) {
            methodList.add(method.name)
        }
        Collections.sort(methodList)
        for (name in methodList) {
            println(name)
        }
    }

}