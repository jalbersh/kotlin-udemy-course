package loops

fun main(args: Array<String>) {
    var sum:Long = 0L
    for (i in 1..100L) {
        sum += i
    }
    println(sum)
    val list = listOf("James","Giovanna","Maria")
    for (element in list) {
        println(element)
    }
    for ((index,element) in list.withIndex()) {
        println("element at $index is $element")
    }
    var x=9
    while (x>=0) {
        print(x--)
    }
    println()
    for (c in "Goobage") {
        if (c == 'a') break
        print(c)
    }
    println()
    for (element in list) {
        if (element.contains('o')) continue
        println(element)
    }
    println()
    outer@ for (i in 1..5) {
        for (j in 1..5) {
            if (i+j == 5) break@outer
            println("$i+$j="+(i+j))
        }
    }
    // What's the sum of all numbers from 100 to 100,000?
    sum=0L
    for (i:Long in 100L..100000L) {
        sum += i
    }
    println(sum)
    println()

    /*
    Create an array list of your favorite book titles. Loop over this list and, if
the title contains the letter ‘e’, print each character of the name on a new
line.
     */
    val books = listOf("The Count of Monte Cristo","The John Matherson Series","The Very Long Engagement", "The Pillars of the Earth","The Nightingale","All the Light We Cannot See","Citizens of London","The Diary of a Young Girl","The Century Trilogy","The Girl With...")

    for (book in books) {
        if (book.contains('a')) {
            println(book)
            for (letter in book) println(letter)
        }
    }
}