package uDemyProjects;

import java.util.Scanner;

public class BasicBank {

    public static void main(String[] args) {

        double balance = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Basic Bank!");
        System.out.println("1 - Deposit");
        System.out.println("2 - Withdrawal");
        System.out.println("3 - Current Balance");
        System.out.println("4 - Exit Bank");
        System.out.println("---------------------------------------------");
        System.out.println("What would you like to do?:");

        int task = scanner.nextInt();

        if (task == 4) {
            System.out.println("Thank you for visiting Basic Bank. Have a great day!");
        } else {
            while (task == 1 || task == 2 || task == 3) {

                switch (task) {
                    case 1:
                        System.out.println("How much would you like to deposit?");
                        Double deposit = scanner.nextDouble();
                        if (deposit < 0) {
                            throw new ArithmeticException("Deposit must be more than 0");
                        } else {
                            balance += deposit;
                            System.out.println("Your new balance is: " + balance);
                        }
                        break;
                    case 2:
                        System.out.println("How much would you like to withdraw?");
                        Double withdrawal = scanner.nextDouble();
                        if (withdrawal < 0) {
                            throw new ArithmeticException("Withdrawal amount must be greater than 0");
                        } else if (withdrawal > balance) {
                            throw new ArithmeticException("There are insufficient funds to cover this withdrawal");
                        } else {
                            balance -= withdrawal;
                            System.out.println("Your new balance is: " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Your current balance is:" + balance);
                        break;
                    case 4:

                        break;


                }
                System.out.println("What would you like to do next?:");
                scanner.nextInt();


            }
        }
    }
}
