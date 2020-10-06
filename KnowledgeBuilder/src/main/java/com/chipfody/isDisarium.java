package com.chipfody;

/*
Write a Java program or function which checks whether given number is Disarium number or not. Your program should take input number from the user.

135 is a Disarium number. Because, it is equal to sum of its digits raised to the power of their respective position.

        135 = 11 + 32 + 53
        135 = 1 + 9 + 125
        135 = 135
*/


import java.util.Scanner;

public class isDisarium {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int numLength = Integer.toString(number).length();
        double sum = 0;
        int tempNum = number;

        for (int i = numLength; i > 0; i--) {
             int iDigit = tempNum % 10;
             sum += Math.pow(iDigit, i);
             tempNum /= 10;
        }
        //boolean answer = number == sum;

	System.out.println(number == sum);

    }
}
