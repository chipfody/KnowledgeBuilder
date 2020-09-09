package uDemyProjects;

/*
Write a method called isPalindrome with one int parameter called number.

        The method needs to return a boolean.
        It should return true if the number is a palindrome number otherwise it should return false.

        Example Input/Output

        isPalindrome(-1221); → should return true
        isPalindrome(707); → should return true
        isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

*/

public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        number = Math.abs(number);
        int origNumber = number;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number /10;
        }
        return (origNumber == reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(123454321));
    }
}
