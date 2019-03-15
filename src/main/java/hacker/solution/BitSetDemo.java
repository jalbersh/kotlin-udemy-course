package hacker.solution;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetDemo {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int operations = sc.nextInt();
        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);
        for (int i = 0; i < operations; i++) {
            String operation = sc.next();
            int setNum = sc.nextInt();
            int index = sc.nextInt();
            if (operation.equals("AND")) {
                if (setNum == 1) B1.and(B2);
                else B2.and(B1);
            } else if (operation.equals("OR")) {
                if (setNum == 1) B1.or(B2);
                else B2.or(B1);
            } else if (operation.equals("XOR")) {
                if (setNum == 1) B1.xor(B2);
                else B2.xor(B1);
            } else if (operation.equals("FLIP")) {
                if (setNum == 1) B1.flip(index);
                else B2.flip(index);
            } else if (operation.equals("SET")) {
                if (setNum == 1) B1.set(index);
                else B2.set(index);
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
    }
}
