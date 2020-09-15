package uDemyProjects;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double result = 0.0;

        System.out.println("What function would you like to perform?:");
        System.out.println("1 :  Addition");
        System.out.println("2 :  Subtraction");
        System.out.println("3 :  Multiplication");
        System.out.println("4 :  Division");
        System.out.println("5 :  Remainder");

        int operator = scanner.nextInt();


        switch (operator) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid! Please enter a valid number");
                return;
        }


        System.out.println("The answer is: " + result);
    }
}
