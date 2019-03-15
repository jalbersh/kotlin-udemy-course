package hacker.solution;

import java.util.Scanner;

public class TwoDArray {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        int bestSum = -100000;
        for (int r=0;r<4;r++) {
            for (int c=0;c<4;c++) {
                int[][] h = getHourglass(arr,r,c);
                int val = getHourglassSum(h);
                if (val > bestSum) bestSum = val;
            }
        }
        System.out.println(bestSum);
    }
    private static int getHourglassSum(int[][] a) {
        int sum = 0;
        for (int row=0;row<3;row++) {
           if (row==1) {
                sum += a[row][1];
            } else {
                for (int col = 0; col < 3; col++) {
                    sum += a[row][col];
                }
            }
        }
        return sum;
    }
    private static int[][] getHourglass(int[][] a, int r, int c) {
        int[][] b = new int[3][3];
        for (int row=0;row<3;row++) {
            for (int col=0;col<3;col++) {
                b[row][col] = a[row+r][col+c];
            }
        }
        return b;
    }
}
