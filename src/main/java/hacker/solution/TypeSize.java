package hacker.solution;

import java.util.Scanner;

public class TypeSize {
    public static void fitIn(String s) {
        try {
            Long l = Long.parseLong(s);
            System.out.printf("%d can be fitted in:\n", l);
            if (l >= -Math.pow(2, 7) && l < Math.pow(2, 7)) System.out.println("* byte");
            if (l >= -Math.pow(2, 15) && l < Math.pow(2, 15)) System.out.println("* short");
            if (l >= -Math.pow(2, 31) && l < Math.pow(2, 31)) System.out.println("* int");
            System.out.println("* long");
        } catch (NumberFormatException e) {
            System.out.printf("%s can't be fitted anywhere.\n", s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int j = 0;
        try {
            j = Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            System.exit(0);
        }
        for (int i = 0; i < j; i++) {
            String s = sc.nextLine();
            fitIn(s);
        }
        sc.close();
    }
}

