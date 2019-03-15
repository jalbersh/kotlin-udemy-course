package hacker.solution;

import java.math.BigInteger;
import java.util.Scanner;

public class IsPrime {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scanner.nextLine();
        try {
            BigInteger num = new BigInteger(s);
            boolean flag = false;
            BigInteger two = new BigInteger("2");
            if (!num.divide(two).equals(BigInteger.ZERO) && num.isProbablePrime(80)) {
//                for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(num) < 1; i = i.add(two))
//                {
//                    if (BigInteger.ZERO.equals(num.mod(i))) {
//                        flag = false;
//                        break;
//                    }
//                }
                flag = true;
            }
            if (flag && num != BigInteger.ONE)
                System.out.println("prime");
            else
                System.out.println("not prime");
        } catch (NumberFormatException nfe) {
            System.out.println("Problem parsing input="+s+": "+nfe.getMessage());
        }
        scanner.close();
    }
}
