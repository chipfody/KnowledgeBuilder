package HackerRank;

/*
You will be given a list of integers, arr, and a single integer k.
You must create an array of length k from elements of arr such that its unfairness is minimized. Call that array subArray. Unfairness of an array is calculated as
max(subArray) - min(subArray).

        Where:
        - max denotes the largest integer in subArray
        - min denotes the smallest integer in subArray

        As an example, consider the array [1, 4, 7, 2] with a k of 2. Pick any two elements, test [4,7]:
        unfairness = max[4,7] - min[4,7] = 7 - 4 = 3

        Testing for all pairs, the solution [1,2] provides the minimum unfairness.

        Note: Integers in arr may not be unique.

        Function Description

        Complete the maxMin function in the editor below. It must return an integer that denotes the minimum possible value of unfairness.

        maxMin has the following parameter(s):

        k: an integer, the number of elements in the array to create
        arr: an array of integers .
*/

import java.util.Arrays;

public class MaxMin {

    static int maxMin(int k, int[] arr) {
        int [] subArray = new int[k];
        int unfairness = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = 0; j < k; j++) {
                subArray[j] = arr[i + j];
            }
            if (subArray[k - 1] - subArray[0] < unfairness) {
                unfairness = subArray[k - 1] - subArray[0];
            }
        }

        return unfairness;
    }
}
