package com.chipfody;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;




public class FindDisariansTest {

    @Test
    public void testFindDisarian() {
        //given
        int start = 100;
        int end = 1000;

        //when
        ArrayList<Integer> testSolution = new ArrayList<>(Arrays.asList(135, 175, 518, 598));
        ArrayList<Integer> actual = FindDisarians.findDisarians(start, end);

        Assert.assertEquals(testSolution, actual);
    }

    @Test
    public void testFindDisarian2() {
        //given
        int start = 1;
        int end = 10;

        //when
        ArrayList<Integer> testSolution = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> actual = FindDisarians.findDisarians(start, end);

        Assert.assertEquals(testSolution, actual);
    }

    @Test
    public void testFindDisarian3() {
        //given
        int start = -10;
        int end = 0;

        //when
        ArrayList<Integer> testSolution = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> actual = FindDisarians.findDisarians(start, end);

        Assert.assertEquals(testSolution, actual);
    }

}