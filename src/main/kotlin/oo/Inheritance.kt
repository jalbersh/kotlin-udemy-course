package oo

import java.util.*

abstract class Person(open val name: String, open val age: Double) {

    init {
        println("person object was created")
    }

    fun yearOfBirth() = "$name was born in "+(2019.0-age).toInt()

    abstract fun greet():String
}

class Student(override val name: String, override val age: Double, val id: Int = Random().nextInt(100) + 1): Person(name, age) {
    init {
        println("Student object was created with id=$id")
    }
    override fun greet() = "Hello $name is a student"
}

class Employee(override val name: String, override val age: Double, val id: Int = Random().nextInt(100) + 1): Person(name, age) {
    init {
        println("Employee object was created with id=$id")
    }
    fun receivePay() {
        println("received pay")
    }
    override fun greet() = "Hello $name is an employee"
}

open class Man(override val name: String, override val age: Double):Person(name, age) {
    init {
        println("Man object was created with name=$name")
    }
    override fun greet() = "Hello $name is just a man"
    // abstract fun doit() - can't add abstract method to non-abstract class
}

// a kotlin module can contain multiple class definitions - might be confusing
// DRY = Don't Repeat Yourself - inherit common properties and methods in open or abstract classes when possible
// can't instantiate abstract class. So, if we don't instantiate, it's wasted
// same with an abstract method. If method declared as open, can override it, but don't have to
// if method is declared abstract, have to override in child class

class NotOpen // default is final, ie not open, can't inherit
open class Open
class Inherit:Open() // can inherit from open or abstract classes


fun main(args: Array<String>) {
    val man = Man("James", 56.166)
    println(man.yearOfBirth())
    println(man.greet())
    val student = Student("John",25.0)
    println(student.greet())
    val employee = Employee("Jane",32.0)
    println(employee.greet())
    employee.receivePay()
    println(employee.yearOfBirth())
}
