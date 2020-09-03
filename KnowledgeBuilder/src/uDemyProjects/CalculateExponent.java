package uDemyProjects;

import java.util.Scanner;

public class CalculateExponent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a base number: ");
        int baseNumb = scanner.nextInt();
        System.out.println("Please enter and exponent: ");
        int exponent = scanner.nextInt();

        for (int i = 0; i <= exponent; i++) {
            powerOf(baseNumb, i);
        }
    }

        static void powerOf ( int base, int exp){
            System.out.println(base + " raised to the power of " + exp + " equals: " + (int) Math.pow(base, exp));

        }
    }

