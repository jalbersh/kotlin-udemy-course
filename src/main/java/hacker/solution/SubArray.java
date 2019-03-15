package hacker.solution;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int negCount = 0;
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a.length;j++) {
                if (sumSub(a,i,j)<0) negCount++;
            }
        }
        System.out.println(negCount);
    }
    private static int sumSub(int[] arr,int i, int j) {
        int sum=0;
        for (int k=i;k<=j;k++) sum+=arr[k];
        return sum;
    }
}
