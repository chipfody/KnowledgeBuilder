package CodingBat;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayWorkTest {

    @Test
    public void testScoresIncreasing() {
        //Given
        int[] testArray = new int[] {1, 3, 4};
        int[] testArray2 = new int[] {1, 3, 2};
        int[] testArray3 = new int[] {1, 1, 4};
        int[] testArray4 = new int[] {1, 1, 2, 4, 4, 7};
        int[] testArray5 = new int[] {1, 1, 2, 4, 3, 7};
        int[] testArray6 = new int[] {-5, 4, 11};

        Assert.assertTrue(ArrayWork.scoresIncreasing(testArray));
        Assert.assertFalse(ArrayWork.scoresIncreasing(testArray2));
        Assert.assertTrue(ArrayWork.scoresIncreasing(testArray3));
        Assert.assertTrue(ArrayWork.scoresIncreasing(testArray4));
        Assert.assertFalse(ArrayWork.scoresIncreasing(testArray5));
        Assert.assertTrue(ArrayWork.scoresIncreasing(testArray6));
    }

}