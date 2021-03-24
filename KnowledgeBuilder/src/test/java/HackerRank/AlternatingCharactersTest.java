package HackerRank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlternatingCharactersTest {

    @Test
    public void altCharTest1() {
        //Given
        int expected1 = 3;
        int expected2 = 4;
        int expected3 = 0;
        int expected4 = 0;
        int expected5 = 4;
        int expected6 = 6;
        int expected7 = 4;
        int expected8 = 1;
        int expected9 = 3;
        int expected10 = 0;

        //when
        int actual1 = AlternatingCharacters.alternatingCharacters("AAAA");
        int actual2 = AlternatingCharacters.alternatingCharacters("BBBBB");
        int actual3 = AlternatingCharacters.alternatingCharacters("ABABABAB");
        int actual4 = AlternatingCharacters.alternatingCharacters("BABABA");
        int actual5 = AlternatingCharacters.alternatingCharacters("AAABBB");
        int actual6 = AlternatingCharacters.alternatingCharacters("AAABBBAABB");
        int actual7 = AlternatingCharacters.alternatingCharacters("AABBAABB");
        int actual8 = AlternatingCharacters.alternatingCharacters("ABABABAA");
        int actual9 = AlternatingCharacters.alternatingCharacters("ABBABBAA");
        int actual10 = AlternatingCharacters.alternatingCharacters("");

        //Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        Assert.assertEquals(expected5, actual5);
        Assert.assertEquals(expected6, actual6);
        Assert.assertEquals(expected7, actual7);
        Assert.assertEquals(expected8, actual8);
        Assert.assertEquals(expected9, actual9);
        Assert.assertEquals(expected10, actual10);
    }
}