package HackerRank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeautifulBinaryStringTest {

    @Test
    public void beautifulBinaryStringTesty() {
//        Given
        String string1 = "0101010";
        String string2 = "01100";
        String string3 = "0100101010";
        String string4 = "10110101101010001111011100100001010001111010110000111100110110111110011011000111100010011100111";
        int expected1 = 2;
        int expected2 = 0;
        int expected3 = 3;
        int expected4 = 6;

//        When
        int actual1 = BeautifulBinaryString.beautifulBinarySting(string1);
        int actual2 = BeautifulBinaryString.beautifulBinarySting(string2);
        int actual3 = BeautifulBinaryString.beautifulBinarySting(string3);
        int actual4 = BeautifulBinaryString.beautifulBinarySting(string4);

//        Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);



    }

}