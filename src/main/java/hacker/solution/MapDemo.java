package hacker.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        while (n-- > 0) {
            String name = scan.nextLine();
            int number = scan.nextInt();
            phoneBook.put(name,number);
            scan.nextLine();
        }
        while (scan.hasNext()) {
            String wanted = scan.nextLine();
            Integer lookup = phoneBook.get(wanted);
            if (lookup != null) {
                System.out.println(wanted+"="+lookup);
            } else System.out.println("Not found");
        }
        scan.close();
    }
}
