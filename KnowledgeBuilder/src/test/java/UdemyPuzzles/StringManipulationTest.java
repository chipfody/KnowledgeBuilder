package UdemyPuzzles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationTest {


    public static void runTests(){


        String [] params1 = {"12345","apple","tiger","candy","add","ad","a","","del","denny","sfveaadelbb"};
        String  [] expected = {"234","ppl","ige","and","add","ad","a","","del","enn","aad"};

        for(int i=0; i < params1.length; i++){
            String result = StringManipulation.middleThree(params1[i]);
            if(result.equals(expected[i])) {
                System.out.println(printPassResult(params1[i], expected[i], result));
            } else{
                System.out.println(printFailResult(params1[i], expected[i], result));
            }
        }
    }

    private static String printPassResult(Object params1, Object expected, Object result){
        return "PASS: middleThree("+ params1.toString()+ ") -> " + result.toString();
    }


    private static String printFailResult(Object params1, Object expected, Object result){
        String ret = "**********************" + "\n";
        ret += "FAIL: middleThree("+ params1.toString()+ ") -> " + result.toString()
                + "      Expected: "+ expected.toString();
        ret += "\n" + "**********************";
        return ret;
    }

    @Test
    public void testCatDog() {
        boolean actual1 = StringManipulation.catDog("catdog");
        boolean actual2 = StringManipulation.catDog("catcat");
        boolean actual3 = StringManipulation.catDog("1cat1cadodog");
        boolean actual4 = StringManipulation.catDog("catxxdogxxxdog");
        boolean actual5 = StringManipulation.catDog("catxdogxdogxcat");
        boolean actual6 = StringManipulation.catDog("catxdogxdogxca");
        boolean actual7 = StringManipulation.catDog("dogdogcat");
        boolean actual8 = StringManipulation.catDog("dogogcat");
        boolean actual9 = StringManipulation.catDog("dog");
        boolean actual10 = StringManipulation.catDog("cat");
        boolean actual11 = StringManipulation.catDog("ca");
        boolean actual12 = StringManipulation.catDog("c");
        boolean actual13 = StringManipulation.catDog("");

        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
        Assert.assertTrue(actual3);
        Assert.assertFalse(actual4);
        Assert.assertTrue(actual5);
        Assert.assertFalse(actual6);
        Assert.assertFalse(actual7);
        Assert.assertTrue(actual8);
        Assert.assertFalse(actual9);
        Assert.assertFalse(actual10);
        Assert.assertTrue(actual11);
        Assert.assertTrue(actual12);
        Assert.assertTrue(actual13);
    }

    @Test
    public void testCodeCount() {
        int actual1 = StringManipulation.countCode("aaacodebbb");
        int actual2 = StringManipulation.countCode("codexxcode");
        int actual3 = StringManipulation.countCode("cozexxcope");
        int actual4 = StringManipulation.countCode("cozfxxcope");
        int actual5 = StringManipulation.countCode("xxcozeyycop");
        int actual6 = StringManipulation.countCode("cozcop");
        int actual7 = StringManipulation.countCode("abcxyz");
        int actual8 = StringManipulation.countCode("code");
        int actual9 = StringManipulation.countCode("ode");
        int actual10 = StringManipulation.countCode("c");
        int actual11 = StringManipulation.countCode("");
        int actual12 = StringManipulation.countCode("AAcodeBBcoleCCccoreDD");
        int actual13 = StringManipulation.countCode("AAcodeBBcoleCCccorfDD");
        int actual14 = StringManipulation.countCode("coAcodeBcoleccoreDD");

        Assert.assertEquals(1, actual1);
        Assert.assertEquals(2, actual2);
        Assert.assertEquals(2, actual3);
        Assert.assertEquals(1, actual4);
        Assert.assertEquals(1, actual5);
        Assert.assertEquals(0, actual6);
        Assert.assertEquals(0, actual7);
        Assert.assertEquals(1, actual8);
        Assert.assertEquals(0, actual9);
        Assert.assertEquals(0, actual10);
        Assert.assertEquals(0, actual11);
        Assert.assertEquals(3, actual12);
        Assert.assertEquals(2, actual13);
        Assert.assertEquals(3, actual14);

    }

    @Test
    public void testMaxEnd3() {
    //Given
        int[] testArray = new int[] {1, 2, 3};
        int[] testArray2 = new int[] {11,5, 9};
        int[] testArray3 = new int[] {2, 11, 3};
        int[] testArray4 = new int[] {11, 3, 3};
        int[] testArray5 = new int[] {3, 11, 11};
        int[] testArray6 = new int[] {2, 2, 2};
        int[] testArray7 = new int[] {2, 11, 2};
        int[] testArray8 = new int[] {0, 0, 1};

        int [] expected = new int[] {3, 3, 3};
        int [] expected2 = new int[] {11, 11, 11};
        int [] expected3 = new int[] {3, 3, 3};
        int [] expected4 = new int[] {11, 11, 11};
        int [] expected5 = new int[] {11, 11, 11};
        int [] expected6 = new int[] {2, 2, 2};
        int [] expected7 = new int[] {2, 2, 2};
        int [] expected8 = new int[] {1, 1, 1};

        Assert.assertArrayEquals(expected, StringManipulation.maxEnd3(testArray));
        Assert.assertArrayEquals(expected2, StringManipulation.maxEnd3(testArray2));
        Assert.assertArrayEquals(expected3, StringManipulation.maxEnd3(testArray3));
        Assert.assertArrayEquals(expected4, StringManipulation.maxEnd3(testArray4));
        Assert.assertArrayEquals(expected5, StringManipulation.maxEnd3(testArray5));
        Assert.assertArrayEquals(expected6, StringManipulation.maxEnd3(testArray6));
        Assert.assertArrayEquals(expected7, StringManipulation.maxEnd3(testArray7));
        Assert.assertArrayEquals(expected8, StringManipulation.maxEnd3(testArray8));

    }
    @Test
    public void testStringTimes() {

        String expected1 = "HiHi";
        String expected2 = "HiHiHi";
        String expected3 = "Hi";
        String expected4 = "";
        String expected5 = "HiHiHiHiHi";
        String expected6 = "Oh Boy!Oh Boy!";
        String expected7 = "xxxx";
        String expected8 = "";
        String expected9 = "codecode";
        String expected10 = "codecodecode";


        Assert.assertEquals(expected1, StringManipulation.stringTimes("Hi", 2));
        Assert.assertEquals(expected2, StringManipulation.stringTimes("Hi", 3));
        Assert.assertEquals(expected3, StringManipulation.stringTimes("Hi", 1));
        Assert.assertEquals(expected4, StringManipulation.stringTimes("Hi", 0));
        Assert.assertEquals(expected5, StringManipulation.stringTimes("Hi", 5));
        Assert.assertEquals(expected6, StringManipulation.stringTimes("Oh Boy!", 2));
        Assert.assertEquals(expected7, StringManipulation.stringTimes("x", 4));
        Assert.assertEquals(expected8, StringManipulation.stringTimes("", 4));
        Assert.assertEquals(expected9, StringManipulation.stringTimes("code", 2));
        Assert.assertEquals(expected10, StringManipulation.stringTimes("code", 3));
    }

    @Test
    public void testFrontTimes() {
        //Given
        String expected1 = "ChoCho";
        String expected2 = "ChoChoCho";
        String expected3 = "AbcAbcAbc";
        String expected4 = "AbAbAbAb";
        String expected5 = "AAAA";
        String expected6 = "";
        String expected7 = "";

        //When
        String actual1 = StringManipulation.frontTimes("Chocolate", 2);
        String actual2 = StringManipulation.frontTimes("Chocolate", 3);
        String actual3 = StringManipulation.frontTimes("Abc", 3);
        String actual4 = StringManipulation.frontTimes("Ab", 4);
        String actual5 = StringManipulation.frontTimes("A", 4);
        String actual6 = StringManipulation.frontTimes("", 4);
        String actual7 = StringManipulation.frontTimes("Abc", 0);

        //Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        Assert.assertEquals(expected5, actual5);
        Assert.assertEquals(expected6, actual6);
        Assert.assertEquals(expected7, actual7);
    }

    @Test
    public void testEndOther() {
        String a1 = "Hiabc";
        String b1 = "abc";
        String a2 = "AbC";
        String b2 = "HiaBc";
        String a3 = "abc";
        String b3 = "abXabc";
        String a4 = "Hiabc";
        String b4 = "abcd";
        String a5 = "Hiabc";
        String b5 = "bc";
        String a6 = "Hiabcx";
        String b6 = "bc";
        String a7 = "abc";
        String b7 = "abc";
        String a8 = "xyz";
        String b8 = "12xyz";
        String a9 = "yz";
        String b9 = "12xz";
        String a10 = "Z";
        String b10 = "12xz";
        String a11 = "12";
        String b11 = "12";
        String a12 = "abcXYZ";
        String b12 = "abcDEF";
        String a13 = "ab";
        String b13 = "ab12";
        String a14 = "ab";
        String b14 = "12Ab";

        Assert.assertTrue(StringManipulation.endOther(a1, b1));
        Assert.assertTrue(StringManipulation.endOther(a2, b2));
        Assert.assertTrue(StringManipulation.endOther(a3, b3));
        Assert.assertFalse(StringManipulation.endOther(a4, b4));
        Assert.assertTrue(StringManipulation.endOther(a5, b5));
        Assert.assertFalse(StringManipulation.endOther(a6, b6));
        Assert.assertTrue(StringManipulation.endOther(a7, b7));
        Assert.assertTrue(StringManipulation.endOther(a8, b8));
        Assert.assertFalse(StringManipulation.endOther(a9, b9));
        Assert.assertTrue(StringManipulation.endOther(a10, b10));
        Assert.assertTrue(StringManipulation.endOther(a11, b11));
        Assert.assertFalse(StringManipulation.endOther(a12, b12));
        Assert.assertFalse(StringManipulation.endOther(a13, b13));
        Assert.assertTrue(StringManipulation.endOther(a14, b14));
    }

}