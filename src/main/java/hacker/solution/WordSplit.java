package hacker.solution;

import java.util.Scanner;

public class WordSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String regex = "\\P{Alpha}+";
        String[] tokens = s.split(regex);
        int count = 0;
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            token = token.trim();
            if (token.length() == 0) {
                count++;
            }
            if (token.contains("'")) count--;
        }
        System.out.println(tokens.length - count);
        for (String element : tokens) {
            if (element.trim().length() > 0) {
                if (element.contains("'")) {
                    String[] elems = element.split("'");
                    for (String elem : elems) {
                        System.out.println(elem);
                    }
                } else System.out.println(element);
            }
        }
        scan.close();
    }

}
