package CodeSignal;

/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

       Given a ticket number n, determine if it's lucky or not.

       Example

       For n = 1230, the output should be
       isLucky(n) = true;
       For n = 239017, the output should be
       isLucky(n) = false.
*/

import java.util.Scanner;

public class LuckyNumber {
    static boolean isLucky(int n) {

        int mid = Integer.toString(n).length() / 2;
        int divisor = (int) Math.pow(10, mid);
        int frontHalf = n / divisor;
        int backHalf = n % divisor;

        return addHalf(frontHalf, mid) == addHalf(backHalf, mid);

    }

    static int addHalf(int num, int m) {
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        if(isLucky(num)) {
            System.out.println(num + " is a lucky number!");
        } else {
            System.out.println(num + " is not a lucky number");
        }
        scanner.close();
    }

}
