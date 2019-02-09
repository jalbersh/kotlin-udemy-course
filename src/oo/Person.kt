package oo

class Person(val name: String, val age: Double) {

    init {
        println("person object was created")
    }

    fun yearOfBirth() = (2019.0-age).toInt()

    fun greet() = "Hello "+name
}

fun main(args: Array<String>) {
    val person = Person("James", 56.166)
    println(person.yearOfBirth())
    println(person.greet())
}
