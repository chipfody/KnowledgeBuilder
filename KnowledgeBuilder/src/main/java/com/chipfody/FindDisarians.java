package com.chipfody;

public class FindDisarians {

    public static void main(String[] args) {

        int start = 100;
        int end = 1000;

        System.out.print("The Disarian numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (DisarianNumber.isDisarian(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
