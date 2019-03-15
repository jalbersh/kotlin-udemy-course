package hacker.solution;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        sc.close();
        BigInteger b1 = new BigInteger(line1);
        BigInteger b2 = new BigInteger(line2);
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}
