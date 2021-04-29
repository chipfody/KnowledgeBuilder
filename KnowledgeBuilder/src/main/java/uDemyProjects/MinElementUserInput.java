package uDemyProjects;

import java.util.Scanner;

public class MinElementUserInput {


    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an array size: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter " + n + " integers to fill the array:");
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    private static int findMin(int[] input) {
        int min = 1000;
        for (int num : input) {
            if (num < min)
                min = num;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readInteger();
        int[] inputArray = readElements(n);
        System.out.println("The minimum element in the array is " + findMin(inputArray));
    }
}
