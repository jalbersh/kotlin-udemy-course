package hacker.solution;

import java.math.BigDecimal;
import java.util.*;

public class ArrayListDemo {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList[] rows = new ArrayList[n];
        for (int i=0; i<n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            rows[i]=row;
        }
        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(rows[(x - 1)].get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
