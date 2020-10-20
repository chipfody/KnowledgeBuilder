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

}