package UdemyPuzzles;

import org.junit.Assert;
import org.junit.Test;

public class AllDollarsTest {

    @Test
    public void testAddDollarSigns() {
        //Given
        String testString1 = "test";
        String testString2 = "";
        String testString3 = "Mississippi";

        //when

        String expected1 = "t$e$s$t";
        String expected2 = "";
        String expected3 = "M$i$s$s$i$s$s$i$p$p$i";

        //then
        Assert.assertEquals(expected1, addDollarSigns.allDollars(testString1));
        Assert.assertEquals(expected2, addDollarSigns.allDollars(testString2));
        Assert.assertEquals(expected3, addDollarSigns.allDollars(testString3));
    }

}