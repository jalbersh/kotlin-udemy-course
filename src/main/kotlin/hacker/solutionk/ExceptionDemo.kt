package hacker.solutionk

import java.util.*

object ExceptionDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`);
        try {
            val x = sc.nextInt();
            val y = sc.nextInt();
            println(x/y);
        } catch (e: InputMismatchException) {
            println("java.util.InputMismatchException");
        } catch (e: ArithmeticException) {
            println("java.lang.ArithmeticException: " + e.message)
        } catch (e: Exception) {
            println(e.message)
        }
    }
}