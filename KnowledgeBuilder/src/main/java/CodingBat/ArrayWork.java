package CodingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayWork {


//    Given an array of scores, return true if each score is equal or greater than the one before.
//    The array will be length 2 or more.

    public static boolean scoresIncreasing(int[] scores) {
        boolean result = true;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }


//    Given a list of integers, return a list of the integers, omitting any that are less than 0

    public static List<Integer> noNeg(List<Integer> nums) {
        List noNegList = new ArrayList<>();
        for (Integer num : nums) {
            if (num >=0)
                noNegList.add(num);
        }
        return noNegList;

//  Alternate solution:
//        public List<Integer> noNeg(List<Integer> nums) {
//            nums.removeIf(n -> n < 0);
//            return nums;
    }

    public static List<Integer> no9(List<Integer> nums) {
        List no9List = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 10 != 9)
                no9List.add(num);
        }
        return no9List;

//        nums.removeIf(n -> n % 10 == 9);
//        return nums;
    }

//    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.

    public static int bigDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }


/*
    Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ
    from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
*/
public boolean scoresClump(int[] scores) {
    boolean result = false;
    for (int i = 0; i < scores.length - 2; i++) {
        if (scores[i + 1] - scores[i] <= 2 && scores [i + 2] - scores[i + 1] <= 2 && scores[i + 2] - scores[i] <= 2) {
            result = true;
            break;
        }
    }
    return result;

}


   /*
     Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count
     and numbers that come immediately after a 13 also do not count.
    */
   public int sum13(int[] nums) {
       int sum = 0;
       if (nums.length == 0) {
           return sum;
       } else {
           for (int i = 0; i < nums.length; i++) {
               if (nums[i] != 13) {
                   sum += nums[i];
               } else { i += 1;
               }
           }
       }
       return sum;
   }


//    Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

    public static boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length -2; i++) {
            if ( nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0 ) {
                return true;
            } else {
                if ( nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1 ) {
                    return true;
                }
            }
        }
        return false;
    }


/*
    For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering
    another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
*/

    public static int[] tenRun(int[] nums) {
        int [] result = new int[nums.length];
        int setNum = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                setNum = nums[i];
            }
            if (setNum == -1) {
                result[i] = nums[i];
            } else {
                result[i] = setNum;
            }
        }
        return result;
    }

/*
    Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger.
    We'll say that the second half begins at index length/2. The array length will be at least 2.
*/

    public static int scoresAverage(int[] scores) {

        int[] frontHalf = Arrays.copyOfRange(scores, 0, scores.length/2);
        int[] backHalf = Arrays.copyOfRange(scores, scores.length/2, scores.length);

        int frontAverage = average(frontHalf);
        int backAverage = average(backHalf);

        return frontAverage > backAverage ? frontAverage : backAverage;

    }

    public static int average(int[] halfScore) {
        int sum = 0;
        for (int score : halfScore)
            sum += score;

        return sum/halfScore.length;
    }
}
