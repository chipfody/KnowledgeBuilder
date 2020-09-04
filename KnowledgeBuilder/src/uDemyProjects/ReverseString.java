package uDemyProjects;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word to reverse:");
        String word = scanner.nextLine();
        scanner.close();
        System.out.println("The word \"" + word + "\" reversed in Method A is: " + reverseMethodA(word));
        System.out.println("The word " + word + " reversed in Method B is: " + reverseMethodB(word));

        }

    static String reverseMethodA (String toBeRev) {
        StringBuilder revWord = new StringBuilder(toBeRev);
        return revWord.reverse().toString();
    }

    static String reverseMethodB (String toBeRev) {
        int length = toBeRev.length();
        String revWord = "";
        for (int i = length - 1; i >= 0; i--) {
            revWord  += toBeRev.charAt(i);
        }
        return revWord;
    }

}
