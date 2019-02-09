package oo

/*
Create a class representing a book. Every book has a title, an author, a
publication year and is either borrowed or not. Choose an appropriate
data type for each of these properties.
A book can be borrowed from you or returned to you. In both cases, the
borrowed property is updated accordingly. Also, a book should be able
to print itself to the command line, including its title, author, and
publication year.
 */

class Book(val title:String, val author:String, val year:Int, var borrowed: Boolean) {
    fun borrowBook() {
        if (this.borrowed) {
            println("This book has already been borrowed")
        } else {
            this.borrowed = true
        }
    }
    fun returnBook() {
        if (!this.borrowed) {
            println("This book has already been returned")
        }
        else {
            this.borrowed = false
        }
    }
    fun print() {
        println("$title by $author, written in $year"+if (this.borrowed) " has been borrowed" else " is in your library")
    }
}
fun main(args: Array<String>) {
    var book = Book("A Diary of a Young Girl","Anne Frank",1943, false)
    book.print()
    book.borrowBook()
    book.borrowBook()
    book.print()
    book.returnBook()
    book.print()
}