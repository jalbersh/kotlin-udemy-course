package hacker.solution;

import java.util.Scanner;

public class Palindrome {
    public static String reverse(String in) {
//        in = in.toLowerCase();
        String out = "";
        for (int i = in.length() - 1; i >= 0; i--) {
            out += in.toCharArray()[i];
        }
        return out;
    }

    public static String isPalindrome(String input) {
        //input.forEach{ string += it.value.toString().toLowerCase() }
        //String reverse = reverse(input);
        //String reverse = Arrays.stream(string.split("")).asReversed().joinToString("")
        System.out.println("comparing " + input + " with " + reverse(input));
        if (input.equals(reverse(input))) return "Yes";
        return "No";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A));
//        var string: String = ""
//        input.forEach{ string += it.value.toString().toLowerCase() }
//        val reverse = string.split("").asReversed().joinToString("")
//        if (string == reverse) return "Yes" else return "No"

    }

}
