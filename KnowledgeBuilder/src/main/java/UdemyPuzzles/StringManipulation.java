package UdemyPuzzles;

public class StringManipulation {
    /**
     Given a string of odd length, return the middle 3 characters from the string,
     so the string <b>"Monitor"</b> yields <b>"nit"</b>.
     If the string length is less than 3, return the string as is. <br> <br>

     <b>EXPECTATIONS:</b><br>
     middleThree("bunny") <b>---></b> "unn" <br>
     middleThree("peter") <b>---></b> "ete" <br>
     middleThree("Jamaica") <b>---></b>"mai" <br>
     */

    public static String middleThree(String str) {
        String result = str;
        if (str.length() < 3) {
            result = str;
        } else {
            int mid = str.length() / 2;
            result = str.substring(mid -1, mid + 2);
        }
        return result;

    }


/*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
*/

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }


/*
  *  Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
  *
  *  countCode("aaacodebbb") → 1
  *  countCode("codexxcode") → 2
  *  countCode("cozexxcope") → 2
*/


    public  static int countCode(String str) {
        int count = 0;
        for (int i= 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') count++;
        }
        return count;
    }


/*    Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
 *
 *   maxEnd3([1, 2, 3]) → [3, 3, 3]
 *   maxEnd3([11, 5, 9]) → [11, 11, 11]
 *   maxEnd3([2, 11, 3]) → [3, 3, 3]
*/

    public static int[] maxEnd3(int[] nums) {
        int largest = nums[0] > nums[2] ? nums[0] : nums[2];  // can also use Math.max(nums[0], nums[2]);

        for(int i = 0; i < 3; i++) {
            nums[i] = largest;
        }
        return nums;
    }

//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    public static String stringTimes(String str, int n) {
        String newString = "";
        for (int i = 1; i <= n; i++) {
            newString += str;
        }
        return newString;
    }


//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3
//    chars, or whatever is there if the string is less than length 3. Return n copies of the front;

    public static String frontTimes(String str, int n) {

        String newString = "";
        int run = 3;

        if (str.length()< 3) {
            run = str.length();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < run; j++) {
                newString += str.charAt(j);
            }
        }
        return newString;

//        Alternative solution:

//        String front = str.substring(0, run);
//
//        String result = "";
//        for (int i=0; i<n; i++) {
//            result += front;
//        }
    }

//    Given two strings, return true if either of the strings appears at the very end of the other
//        string, ignoring upper/lower case differences (in other words, the computation should
//        not be "case sensitive").

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()).equals(b);
        } else {
            return b.substring(b.length() - a.length()).equals(a);
        }
    }


}
