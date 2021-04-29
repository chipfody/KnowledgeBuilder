package uDemyProjects;

import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int size) {
        int[] result = new int[size];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter " + size + " integers");
        for (int i = 0; i < size; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    public static int[] sortIntegers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for the array size");
        int n = scanner.nextInt();
        int[] unsortedArray = getIntegers(n);
        int[] sortedArray = sortIntegers(unsortedArray);
        printArray(sortedArray);


    }

}
