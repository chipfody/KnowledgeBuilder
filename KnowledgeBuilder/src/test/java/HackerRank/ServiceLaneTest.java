package HackerRank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceLaneTest {


    @Test
    public void testServiceLane1() {
//        Given
        int [] widths1 = new int[] {2, 3, 1, 2, 3, 2, 3, 3};
        int[][] serviceLanes1 = new int[][]  {{0, 3}, {4, 6}, {6,7}, {3,5}, {0,7}};
        int[]expected1 = new int[] {1, 2, 3, 2, 1};

//        When
        int[] actual1 = ServiceLane.serviceLane(widths1, serviceLanes1);

//        Then
        Assert.assertArrayEquals(expected1, actual1);
    }

    @Test
    public void testServiceLane2() {
        //        Given
        int [] widths2 = new int[] {1, 2, 2, 2, 1};
        int[][] serviceLanes2 = new int[][]  {{2, 3}, {1, 4}, {2, 4}, {2, 4}, {2, 3}};
        int[]expected1 = new int[] {2, 1, 1, 1, 2};

//        When
        int[] actual1 = ServiceLane.serviceLane(widths2, serviceLanes2);

//        Then
        Assert.assertArrayEquals(expected1, actual1);
    }

}