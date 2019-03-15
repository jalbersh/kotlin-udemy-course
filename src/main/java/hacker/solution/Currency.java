package hacker.solution;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale usLocale = Locale.US;
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        String us = usFormat.format(payment);

        Locale inLocale = new Locale("en", "IN");
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(inLocale);
        String india = inFormat.format(payment);

        Locale chLocale = Locale.CHINA;
        NumberFormat chFormat = NumberFormat.getCurrencyInstance(chLocale);
        String china = chFormat.format(payment);

        Locale frLocale = Locale.FRANCE;
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(frLocale);
        String france = frFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
