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
        boolean expected1 = StringManipulation.catDog("catdog");
        boolean expected2 = StringManipulation.catDog("catcat");
        boolean expected3 = StringManipulation.catDog("1cat1cadodog");
        boolean expected4 = StringManipulation.catDog("catxxdogxxxdog");
        boolean expected5 = StringManipulation.catDog("catxdogxdogxcat");
        boolean expected6 = StringManipulation.catDog("catxdogxdogxca");
        boolean expected7 = StringManipulation.catDog("dogdogcat");
        boolean expected8 = StringManipulation.catDog("dogogcat");
        boolean expected9 = StringManipulation.catDog("dog");
        boolean expected10 = StringManipulation.catDog("cat");
        boolean expected11 = StringManipulation.catDog("ca");
        boolean expected12 = StringManipulation.catDog("c");
        boolean expected13 = StringManipulation.catDog("");

        Assert.assertTrue(expected1);
        Assert.assertFalse(expected2);
        Assert.assertTrue(expected3);
        Assert.assertFalse(expected4);
        Assert.assertTrue(expected5);
        Assert.assertFalse(expected6);
        Assert.assertFalse(expected7);
        Assert.assertTrue(expected8);
        Assert.assertFalse(expected9);
        Assert.assertFalse(expected10);
        Assert.assertTrue(expected11);
        Assert.assertTrue(expected12);
        Assert.assertTrue(expected13);
    }

    @Test
    public void testCodeCount() {
        int expected1 = StringManipulation.countCode("aaacodebbb");
        int expected2 = StringManipulation.countCode("codexxcode");
        int expected3 = StringManipulation.countCode("cozexxcope");
        int expected4 = StringManipulation.countCode("cozfxxcope");
        int expected5 = StringManipulation.countCode("xxcozeyycop");
        int expected6 = StringManipulation.countCode("cozcop");
        int expected7 = StringManipulation.countCode("abcxyz");
        int expected8 = StringManipulation.countCode("code");
        int expected9 = StringManipulation.countCode("ode");
        int expected10 = StringManipulation.countCode("c");
        int expected11 = StringManipulation.countCode("");
        int expected12 = StringManipulation.countCode("AAcodeBBcoleCCccoreDD");
        int expected13 = StringManipulation.countCode("AAcodeBBcoleCCccorfDD");
        int expected14 = StringManipulation.countCode("coAcodeBcoleccoreDD");

        Assert.assertEquals(expected1, 1);
        Assert.assertEquals(expected2, 2);
        Assert.assertEquals(expected3, 2);
        Assert.assertEquals(expected4, 1);
        Assert.assertEquals(expected5, 1);
        Assert.assertEquals(expected6, 0);
        Assert.assertEquals(expected7, 0);
        Assert.assertEquals(expected8, 1);
        Assert.assertEquals(expected9, 0);
        Assert.assertEquals(expected10, 0);
        Assert.assertEquals(expected11, 0);
        Assert.assertEquals(expected12, 3);
        Assert.assertEquals(expected13, 2);
        Assert.assertEquals(expected14, 3);

    }

}