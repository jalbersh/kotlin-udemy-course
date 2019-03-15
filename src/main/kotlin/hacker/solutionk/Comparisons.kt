package hacker.solutionk

import java.util.*
import java.util.stream.Collectors.toList

object Comparisons {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var testCases = Integer.parseInt(`in`.nextLine())

        var studentList: MutableList<Student> = ArrayList()
        while (testCases > 0) {
            val id = `in`.nextInt()
            val fname = `in`.next()
            val cgpa = `in`.nextDouble()

            val st = Student(id, fname, cgpa)
            studentList.add(st)

            testCases--
        }
//        studentList = studentList.stream()
//            .sorted(comparing<Student, Double>(Function<Student, Double> { it.getCgpa() }, reverseOrder<Double>())
//                .thenComparing(comparing<Student, String>(Function<Student, String> { it.getFname() }))
//                .thenComparing(comparing<Student, Int>(Function<Student, Int> { it.getId() }))
//            )
//            .collect<MutableList<Student>, Any>(toList<Student>())

        for (st in studentList) {
            println(st.fname)
        }
    }

}
