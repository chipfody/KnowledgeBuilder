package CodingBat;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testNoNeg() {
        //Given
        ArrayList<Integer> expectedList1 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expectedList2 = new ArrayList<>(Arrays.asList(3, 3));
        ArrayList<Integer> expectedList3 = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> expectedList4 = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> expectedList5 = new ArrayList<>(Arrays.asList(0, 1, 2));
        ArrayList<Integer> expectedList6 = new ArrayList<>(Arrays.asList(3, 1, 4));
        ArrayList<Integer> expectedList7 = new ArrayList<>(Arrays.asList(3, 1, 5));

        //when
        List<Integer> actualList1 = ArrayWork.noNeg(Arrays.asList(1, -2));
        List<Integer> actualList2 = ArrayWork.noNeg(Arrays.asList(-3, -3, 3, 3));
        List<Integer> actualList3 = ArrayWork.noNeg(Arrays.asList(-1, -1, -1));
        List<Integer> actualList4 = ArrayWork.noNeg(Arrays.asList());
        List<Integer> actualList5 = ArrayWork.noNeg(Arrays.asList(0, 1, 2));
        List<Integer> actualList6 = ArrayWork.noNeg(Arrays.asList(3, -10, 1, -1, 4, -400));
        List<Integer> actualList7 = ArrayWork.noNeg(Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5));

        //then
        Assert.assertEquals(expectedList1, actualList1);
        Assert.assertEquals(expectedList2, actualList2);
        Assert.assertEquals(expectedList3, actualList3);
        Assert.assertEquals(expectedList4, actualList4);
        Assert.assertEquals(expectedList5, actualList5);
        Assert.assertEquals(expectedList6, actualList6);
        Assert.assertEquals(expectedList7, actualList7);
    }

}