package HackerRank;

/*
Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

        US: formattedPayment
        India: formattedPayment
        China: formattedPayment
        France: formattedPayment
        where formattedPayment is payment formatted according to the appropriate Locale's currency.

        Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

        Input Format

        A single double-precision number denoting payment.
*/

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale locale = Locale.US;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println("US: " + currencyFormat.format(payment));

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setGroupingUsed(true); //indicates that there will be grouping of numbers
        decimalFormat.setGroupingSize(3); // indicates there will be 3 digits separated by commas
        System.out.println("India: " + "Rs." + decimalFormat.format(payment));

        Locale locale2 = Locale.CHINA;
        NumberFormat currencyFormat2 = NumberFormat.getCurrencyInstance(locale2);
        System.out.println("China: " + currencyFormat2.format(payment));

        Locale locale3 = Locale.FRANCE;
        NumberFormat currencyFormat3 = NumberFormat.getCurrencyInstance(locale3);
        System.out.println("France: " + currencyFormat3.format(payment));
    }
}

