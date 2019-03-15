package hacker.solutionk

import java.util.*

object MapDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var n = sc.nextInt();
        sc.nextLine();
        var phoneBook = HashMap<String, Integer>()
        while (n-- > 0) {
            val name = sc.nextLine()
            val phone = sc.nextInt()
            phoneBook.put(name,Integer(phone))
            sc.nextLine()
        }
        while (sc.hasNext()) {
            val s = sc.nextLine();
            val phone = phoneBook.get(s)
            if (phone != null) {
                println(s+"="+phone.toString())
            } else println("Not found")
        }
        sc.close();
    }
}