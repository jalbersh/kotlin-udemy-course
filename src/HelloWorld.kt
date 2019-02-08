import java.util.*

fun getRange(): String {
    val random = Random().nextInt(50) + 1
    val s = random.toString()
    // range 1 to 10, 11 to 20, 21 to 30, 31 to 40, or above 40
    var result = when(random) {
        in 1..10 -> s+" is between 1 and 10"
        in 11..20 -> s+" is between 11 and 20"
        in 21..30 -> s+" is between 21 and 30"
        in 31..40 -> s+" is between 31 and 40"
        else -> random.toString()+" is above 40"
    }
    return result
}

fun main(args: Array<String>) {
    println(getRange())
}