package hacker.solution;

import java.util.Scanner;

public class LargestSmallest {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int numSubs = s.length() - k + 1;
        String[] subs = new String[numSubs];
        for (int i = 0; i < s.length() - k + 1; i++) {
            subs[i] = s.substring(i, i + k);
        }
        java.util.Arrays.sort(subs);
        smallest = subs[0];
        largest = subs[subs.length - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
