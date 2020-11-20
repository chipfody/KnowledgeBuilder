package HackerRank;

/*
    Sorting is useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses as well.
    In this case, it will make it easier to determine which pair or pairs of elements have the smallest absolute difference between them.

    For example, if you've got the list [5, 2, 3, 4, 1], sort it as [1, 2, 3, 4, 5] to see that several pairs have the minimum difference
    of 1: [1, 2), (2, 3), (3, 4), (4, 5)]. The return array would be [1, 2, 2, 3, 3, 4, 4, 5].

    Given a list of unsorted integers, arr, find the pair of elements that have the smallest absolute difference between them.
    If there are multiple pairs, find them all.

    Function Description

    Complete the closestNumbers function in the editor below. It must return an array of integers as described.

    closestNumbers has the following parameter(s):

      +  arr: an array of integers
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {
    static int[] closestNumbers(int[] arr) {

        List<Integer> prelim = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i + 1] - arr[i];
            if (difference < minDiff) {
                minDiff = difference;
                prelim.clear();
                prelim.add(arr[i]);
                prelim.add(arr[i + 1]);
            } else if (difference == minDiff) {
                prelim.add(arr[i]);
                prelim.add(arr[i + 1]);
            }
        }

        int [] result = new int [prelim.size()];
        for (int k = 0; k < prelim.size(); k++) {
            result[k] = prelim.get(k);
        }
        return result;
    }
}
