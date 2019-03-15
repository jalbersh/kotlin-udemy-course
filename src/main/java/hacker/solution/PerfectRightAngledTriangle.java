package hacker.solution;

import java.math.BigInteger;
import java.util.Scanner;

public class PerfectRightAngledTriangle {
    public static BigInteger squareRoot(BigInteger x)
            throws IllegalArgumentException {
        if (x.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Negative argument.");
        }
        if (x == BigInteger.ZERO || x == BigInteger.ONE) {
            return x;
        } // end if
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }
    private static BigInteger getGreatestCommonDivisor(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }
    private static BigInteger getTriangle(BigInteger b, BigInteger c) {
        return squareRoot(c.multiply(c).add(b.multiply(b).negate()));
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            int queries = Integer.parseInt(scanner.nextLine());
            while (queries > 0) {
                String n = scanner.nextLine();
                BigInteger count = BigInteger.ZERO;
                BigInteger num = new BigInteger(n);
                for (BigInteger i = new BigInteger("25"); i.compareTo(num) == -1; i = i.add(BigInteger.ONE)) {
                    BigInteger root = squareRoot(i);
                    if (root.multiply(root).equals(i)) {
                        // find b
                        BigInteger b = BigInteger.ZERO;
                        do {
                            b = b.add(BigInteger.ONE);
                        } while (!getGreatestCommonDivisor(b, i).equals(BigInteger.ONE) && b.compareTo(i) == -1 && !b.equals(BigInteger.ONE));
                        // find a
                        BigInteger a = BigInteger.ZERO;
                        do {
                            a = a.add(BigInteger.ONE);
                        } while (!getGreatestCommonDivisor(a, i).equals(BigInteger.ONE) && a.compareTo(i) == -1  && !a.equals(BigInteger.ONE));
                        if (a.compareTo(i) == -1 && b.compareTo(i) == -1) {
                            System.out.println("a="+a+",b="+b+",c="+i);
                            count = count.add(BigInteger.ONE);
                        }
                    }
                }
                System.out.println(count.toString());
                queries--;
            }
        } catch (Exception e) {
            System.out.println("something went wrong: "+e.getMessage());
        }
    }
}
