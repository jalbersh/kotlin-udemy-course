package hacker.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Comparisons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<_Student> studentList = new ArrayList<_Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();

            _Student st = new _Student(id, name, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList = studentList.stream().sorted(comparing(_Student::getCgpa, reverseOrder())
                .thenComparing(comparing(_Student::getFname))
                .thenComparing(comparing(_Student::getId)))
                .collect(toList());

        for (_Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

}
