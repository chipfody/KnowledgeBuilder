package HackerRank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteTest {

    @Test
    public void ransomNoteTest(){
        //Given
        String[] magazine1 = new String[] {"give",  "me", "one", "grand", "today", "night"};
        String[] note1 = new String[] {"give", "one", "grand", "today"};

        String[] magazine2 = new String[] {"two", "times", "three", "is", "not", "four"};
        String [] note2 = {"two", "times", "two", "is", "four"};

        String[] magazine3 = new String[] {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note3 = new String[] {"ive", "got", "some", "coconuts"};

        String[] magazine4 = new String[] {"give",  "me", "one", "grand", "today", "night"};
        String[] note4 = new String[] {"Give", "one", "grand", "today"};

        //When
        String actual1 = RansomNote.checkMagazine(magazine1, note1);
        String actual2 = RansomNote.checkMagazine(magazine2, note2);
        String actual3 = RansomNote.checkMagazine(magazine3, note3);
        String actual4 = RansomNote.checkMagazine(magazine3, note4);

        //Then
        Assert.assertEquals("Yes", actual1);
        Assert.assertEquals("No", actual2);
        Assert.assertEquals("No", actual3);
        Assert.assertEquals("No", actual4);

    }

}