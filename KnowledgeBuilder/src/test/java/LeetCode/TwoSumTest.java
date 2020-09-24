package LeetCode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {


    @Test
    public void testTwoSum() {
        int[] testArray = {2, 7, 11, 15 };
        int target = 9;

        int[] expected = {0, 1};
        int[] actual = TwoSum.twoSum(testArray, target);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testTwoSum2() {
        int[] testArray = {3,2,4 };
        int target = 6;

        int[] expected = {1, 2};
        int[] actual = TwoSum.twoSum(testArray, target);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testTwoSum3() {
        int[] testArray = {3, 3 };
        int target = 6;

        int[] expected = {0, 1};
        int[] actual = TwoSum.twoSum(testArray, target);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testTwoSum4() {
        int[] testArray = {-1, -2, -3, -4, -5};
        int target = -8;

        int[] expected = {2, 4};
        int[] actual = TwoSum.twoSum(testArray, target);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }


}