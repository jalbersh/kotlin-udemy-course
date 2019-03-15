package hacker.solution;

import java.util.Scanner;

public class StaticBlock {
    public static void main(String[] args) {
        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

    public static int B = 0;
    public static int H = 0;
    public static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        try {
            B = sc.nextInt();
            H = sc.nextInt();
            if (B < 1 || H < 1) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }

    }
}
