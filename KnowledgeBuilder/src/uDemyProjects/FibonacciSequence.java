package uDemyProjects;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number 0 or greater: ");

        int number = scanner.nextInt();
        int currentNumb = 1;
        int prevNumb = 1;
        int fibNumb = 0;

        if (number == 0) {
            fibNumb = 0;
        } else if (number == 1) {
            fibNumb = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                fibNumb = prevNumb + currentNumb;
                prevNumb = currentNumb;
                currentNumb = fibNumb;
            }
        }
        System.out.println("The Fibonaci number is: " + fibNumb);
    }
}
