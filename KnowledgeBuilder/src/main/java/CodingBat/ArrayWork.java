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
    }
}
