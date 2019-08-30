package hacker.solution;

import static java.util.Comparator.comparing;
import static java.util.Collections.reverseOrder;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<Object>();
        if (s.isEmpty()) System.out.println("1Failed"); else System.out.println("1Succeeded");
        s = new Stack<Object>();s.push("apples");
        if (!s.isEmpty()) System.out.println("2Failed"); else System.out.println("2Succeeded");
        s = new Stack<Object>();s.push("apples");
        if (!"apples".equals(s.peek())) System.out.println("3Failed"); else System.out.println("3Succeeded");
        s = new Stack<Object>();
        if (s.peek() != null) System.out.println("4Failed"); else System.out.println("4Succeeded");
        s = new Stack<Object>();s.push("apples");
        if ("oranges".equals(s.peek()) == true) System.out.println("5Failed"); else System.out.println("5Succeeded");
        s = new Stack<Object>();
        if (s.contains("anything") == true) System.out.println("6Failed"); else System.out.println("6Succeeded");
        s = new Stack<Object>(); s.push("apples");
        if (s.contains("anything") == true) System.out.println("7Failed"); else System.out.println("7Succeeded");
        s = new Stack<Object>();s.push("apples");
        if (s.contains("apples") == false) System.out.println("8Failed"); else System.out.println("8Succeeded");
        s = new Stack<Object>();
        s.push("apples");
        s.push("pears");
        s.push("plums");
        if (s.contains("oranges") == true) System.out.println("9Failed"); else System.out.println("9Succeeded");
        s = new Stack<Object>();
        s.push("apples");
        s.push("pears");
        s.push("plums");
        if (s.contains("apples") == false) System.out.println("10Failed"); else System.out.println("10Succeeded");
    }

}