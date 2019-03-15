package hacker.solution;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if (end > S.length()) end = S.length();
        System.out.println(S.substring(start, end));
    }
}
