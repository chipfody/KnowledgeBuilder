package CodingBat;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testNo9() {
        //Given
        ArrayList<Integer> expectedList1 = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> expectedList2 = new ArrayList<>(Arrays.asList(3));
        ArrayList<Integer> expectedList3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expectedList4 = new ArrayList<>(Arrays.asList(45, 90, 28, 13, 0));
        ArrayList<Integer> expectedList5 = new ArrayList<>((Arrays.asList()));
        ArrayList<Integer> expectedList6 = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> expectedList7 = new ArrayList<>(Arrays.asList(0, 0));

        //when
        List<Integer> actualList1 = ArrayWork.no9(Arrays.asList(1, 2, 19));
        List<Integer> actualList2 = ArrayWork.no9(Arrays.asList(9, 19, 29, 3));
        List<Integer> actualList3 = ArrayWork.no9(Arrays.asList(1, 2, 3));
        List<Integer> actualList4 = ArrayWork.no9(Arrays.asList(45, 99, 90, 28, 13, 999, 0));
        List<Integer> actualList5 = ArrayWork.no9(Arrays.asList());
        List<Integer> actualList6 = ArrayWork.no9(Arrays.asList(9));
        List<Integer> actualList7 = ArrayWork.no9(Arrays.asList(0, 9, 0));

        //then
        Assert.assertEquals(expectedList1, actualList1);
        Assert.assertEquals(expectedList2, actualList2);
        Assert.assertEquals(expectedList3, actualList3);
        Assert.assertEquals(expectedList4, actualList4);
        Assert.assertEquals(expectedList5, actualList5);
        Assert.assertEquals(expectedList6, actualList6);
        Assert.assertEquals(expectedList7, actualList7);
    }

    @Test
    public void testBigDiff() {
        Assert.assertEquals(7, ArrayWork.bigDiff(new int[] {10, 3, 5, 6}));
        Assert.assertEquals(8, ArrayWork.bigDiff(new int[] {7, 2, 10, 9}));
        Assert.assertEquals(8, ArrayWork.bigDiff(new int[] {2, 10, 7, 2}));
        Assert.assertEquals(8, ArrayWork.bigDiff(new int[] {2, 10}));
        Assert.assertEquals(8, ArrayWork.bigDiff(new int[] {10, 2}));
        Assert.assertEquals(10, ArrayWork.bigDiff(new int[] {10, 0}));
        Assert.assertEquals(1, ArrayWork.bigDiff(new int[] {2, 3}));
        Assert.assertEquals(0, ArrayWork.bigDiff(new int[] {2, 2}));
        Assert.assertEquals(0, ArrayWork.bigDiff(new int[] {2}));
        Assert.assertEquals(8, ArrayWork.bigDiff(new int[] {5, 1, 6, 1, 9, 9}));
        Assert.assertEquals(3, ArrayWork.bigDiff(new int[] {7, 6, 8, 5}));
        Assert.assertEquals(3, ArrayWork.bigDiff(new int[] {7, 7, 6, 8, 5, 5, 6}));
    }

    @Test

    public void testModThree() {
        Assert.assertTrue(ArrayWork.modThree(new int[] {2, 1, 3, 5}));
        Assert.assertFalse(ArrayWork.modThree(new int[] {2, 1, 2, 5}));
        Assert.assertTrue(ArrayWork.modThree(new int[] {2, 4, 2, 5}));
        Assert.assertFalse(ArrayWork.modThree(new int[] {1, 2, 1, 2, 1}));
        Assert.assertTrue(ArrayWork.modThree(new int[] {9, 9, 9}));
        Assert.assertFalse(ArrayWork.modThree(new int[] {1, 2, 1, 2, 1}));
        Assert.assertFalse(ArrayWork.modThree(new int[] {1, 2, 1}));
        Assert.assertFalse(ArrayWork.modThree(new int[] {1, 2}));
        Assert.assertFalse(ArrayWork.modThree(new int[] {1}));
        Assert.assertFalse(ArrayWork.modThree(new int[] {}));
        Assert.assertFalse(ArrayWork.modThree(new int[] {1, 2, 1, 2, 1}));
        Assert.assertTrue(ArrayWork.modThree(new int[] {9, 7, 2, 9, 2, 2, 6}));
    }

    @Test
    public void testTenRun() {
        int [] expected1 = new int[] {2, 10, 10, 10, 20, 20};
        int [] expected2 = new int[] {10, 10, 20, 20};
        int [] expected3 = new int[] {10, 10, 10, 20};
        int [] expected4 = new int[] {1, 2, 50, 50};
        int [] expected5 = new int[] {1, 20, 50, 50};
        int [] expected6 = new int[] {10, 10};
        int [] expected7 = new int[] {10, 10};
        int [] expected8 = new int[] {0, 0};
        int [] expected9 = new int[] {1, 2};
        int [] expected10 = new int[] {1};
        int [] expected11 = new int[0];

        int [] actual1 = ArrayWork.tenRun(new int[] {2, 10, 3, 4, 20, 5});
        int [] actual2 = ArrayWork.tenRun(new int[] {10, 1, 20, 2});
        int [] actual3 = ArrayWork.tenRun(new int[] {10, 1, 9, 20});
        int [] actual4 = ArrayWork.tenRun(new int[] {1, 2, 50, 1});
        int [] actual5 = ArrayWork.tenRun(new int[] {1, 20, 50, 1});
        int [] actual6 = ArrayWork.tenRun(new int[] {10, 10});
        int [] actual7 = ArrayWork.tenRun(new int[] {10, 2});
        int [] actual8 = ArrayWork.tenRun(new int[] {0, 2});
        int [] actual9 = ArrayWork.tenRun(new int[] {1, 2});
        int [] actual10 = ArrayWork.tenRun(new int[]{1});
        int [] actual11 = ArrayWork.tenRun(new int[] {});

        Assert.assertArrayEquals(expected1, actual1);
        Assert.assertArrayEquals(expected2, actual2);
        Assert.assertArrayEquals(expected3, actual3);
        Assert.assertArrayEquals(expected4, actual4);
        Assert.assertArrayEquals(expected5, actual5);
        Assert.assertArrayEquals(expected6, actual6);
        Assert.assertArrayEquals(expected7, actual7);
        Assert.assertArrayEquals(expected8, actual8);
        Assert.assertArrayEquals(expected9, actual9);
        Assert.assertArrayEquals(expected10, actual10);
        Assert.assertArrayEquals(expected11, actual11);
    }




}