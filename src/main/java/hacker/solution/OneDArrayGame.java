package hacker.solution;

import java.util.Scanner;

public class OneDArrayGame {
    private static boolean isSolvable(int [] array, int m, int i) {
        /* Base Cases */
        if (i < 0 || array[i] == 1) {
            return false;
        } else if (i + 1 >= array.length || i + m >= array.length) {
            return true;
        }
        array[i] = 1; // marks as visited
        /* Recursive Cases */
        return isSolvable(array, m, i + m) ||
                isSolvable(array, m, i + 1) ||
                isSolvable(array, m, i - 1);
    }
    private static boolean solvable(int[] array, int leap, int j) {
        int[] used = new int[array.length];
        int i=0;
        boolean flag = true;
        while (flag) {
            if (used[i]==1) return false;
            used[i]=1;
            if (i<0 || array[i]==1) return false;
            if (i+1 >= array.length || i+leap >= array.length) return true;
            if (array[i+leap]==0) i=i+leap;
            else if (array[i+1]==0) i=i+1;
            else if (array[i-1]==0) i=i-1;
        }
        return flag;
    }
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return solvable(game,leap,0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
