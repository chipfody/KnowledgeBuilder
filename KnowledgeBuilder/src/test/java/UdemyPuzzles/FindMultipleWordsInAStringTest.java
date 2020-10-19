package UdemyPuzzles;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FindMultipleWordsInAStringTest {

    @Test
    public void testFindMatches() {
        // given
        String testString1 = "We have a large inventory of things in our warehouse falling in the category:apparel and the slightly more in demand category:makeup along with the category:furniture ...";
        String testWord = "category:";
        //when
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("apparel", "makeup", "furniture"));
        ArrayList<String> actual = FindMultipleWordsInAString.findMatches(testString1, testWord);
       // System.out.println(actual);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMatches2() {
        // given
        String testString2 = "We have a large inventory of things";
        String testWord2 = "apparel";

        //when
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = FindMultipleWordsInAString.findMatches(testString2, testWord2);

        //then
        Assert.assertEquals(expected, actual);
    }

}