package oo

interface Drivable {
    fun drive()
}

interface Parkable {
    val where: String
}

interface Exercise {
    var distance: Int
    var time: Int
    fun speed()
}

class Car(val color:String): Drivable, Parkable {
    override val where = "Garage"
    override fun drive() {
        println("Baby, you can drive my car!")
    }
}

class Bike(val type: String) :Drivable, Exercise {
    override var distance = 30
    override var time = 2
    override fun drive() {
        println("Let's go ride my bike!")
    }

    override fun speed() {
        println("You rode your bike at "+(distance/time)+" MPH")
    }
}


fun main(args: Array<String>) {
    var car = Car("Blue)")
    var bike = Bike("Road")
    bike.distance=45
    bike.time=3
    car.drive()
    bike.drive()
    bike.speed()
}