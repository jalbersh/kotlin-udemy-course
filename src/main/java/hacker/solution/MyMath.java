package hacker.solution;

public class MyMath {
    public static boolean checker(PerformOperation po, int num) {
        return po.check(num);
    }
    public static PerformOperation isOdd() {
        return n -> (n % 2) != 0;
    }
    public static PerformOperation isPrime() {
        return n -> {
            boolean flag = true;
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        };
    }
    public static PerformOperation isPalindrome() {
        return n -> String.valueOf(n).equals(new StringBuffer(String.valueOf(n)).reverse().toString());
    }
}