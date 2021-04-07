package HackerRank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarsExplorationTest {

    @Test
    public void marsExplorationTest() {
//        Given
        int expected1 = 3;
        int expected2 = 1;
        int expected3 = 0;
        int expected4 = 42;
        int expected5 = 0;

//        When
        int actual1 = MarsExploration.marsExploration("SOSSPSSQSSOR");
        int actual2 = MarsExploration.marsExploration("SOSSOT");
        int actual3 = MarsExploration.marsExploration("SOSSOSSOS");
        int actual4 = MarsExploration.marsExploration("PPPQQQGGGGGGGGGGGGGGGMMMMMMMMMFFFFFFDDDERT");
        int actual5 = MarsExploration.marsExploration("");


//        Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        Assert.assertEquals(expected5, actual5);
    }

}