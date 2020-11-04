package CodingBat;

import java.util.ArrayList;
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

    public int bigDiff(int[] nums) {
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

}
