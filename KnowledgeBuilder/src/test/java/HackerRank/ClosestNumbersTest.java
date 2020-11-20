package HackerRank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClosestNumbersTest {

    @Test

    public void testClosestNumbers() {
        //Given
        int[] expected = new int[] {-20,30};
        int[] expected2 = new int[] {2, 3, 3, 4, 4, 5};
        int[] expected3 = new int[] {-520, -470, -20, 30};
        int[] expected4 = new int[] {63, 71};

        //when
        int[] actual = ClosestNumbers.closestNumbers(new int[] {-20, -3916237, -357920, -3620601, 7374819, 30, -6461594, 266854});
        int[] actual2 = ClosestNumbers.closestNumbers(new int[] {5, 4, 3, 2});
        int[] actual3 = ClosestNumbers.closestNumbers(new int[] { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470});
        int[] actual4 = ClosestNumbers.closestNumbers(new int[] {-5, 15, 25, 71, 63});

        //then
        Assert.assertArrayEquals(expected, actual);
        Assert.assertArrayEquals(expected2, actual2);
        Assert.assertArrayEquals(expected3, actual3);
        Assert.assertArrayEquals(expected4, actual4);
    }

}