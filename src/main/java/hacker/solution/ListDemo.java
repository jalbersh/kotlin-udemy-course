package hacker.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
//    private List<Integer> insert(List<Integer> list, int position, int y) {
//        list.
//    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while (N-- > 0) {
            int n = scan.nextInt();
            list.add(n);
        }
        int Q = scan.nextInt();
        while (Q-- > 0) {
            String command = scan.next();
            if (command.equals("Insert")) {
                int position = scan.nextInt();
                int y = scan.nextInt();
                list.add(position,y);
            } else {
                int position = scan.nextInt();
                list.remove(position);
            }
        }
        scan.close();
        list.stream().forEach(i -> System.out.print(i+" "));
    }
}
