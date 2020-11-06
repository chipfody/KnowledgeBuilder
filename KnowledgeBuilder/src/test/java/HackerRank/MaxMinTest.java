package HackerRank;

import org.junit.Assert;
import org.junit.Test;

public class MaxMinTest {

    @Test
    public void testMaxMin() {
        //Given
        int expected = 20;
        int expected2 = 3;
        int expected3 = 0;
        int expected4 = 1335;

        //when
        int actual = MaxMin.maxMin(3, new int[]{10, 100, 300, 200, 1000, 20, 30});
        int actual2 = MaxMin.maxMin(4, new int[] {1, 2, 3, 4, 10, 20, 30, 40, 100, 200});
        int actual3 = MaxMin.maxMin(2, new int[] {1, 2, 1, 2, 1});
        int actual4 = MaxMin.maxMin(5, new int[] {4504, 1520, 5857, 4094, 4157, 3902, 822, 6643, 2422, 7288, 8245, 9948, 2822, 1784, 7802, 3142, 9739, 5629, 5413, 7232});

        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }
}