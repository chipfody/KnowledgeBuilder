package HackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChocolateFeastTest {

    @Test

    public void chocolateFeastTest() {
        //Given
        int expected1 = 6;
        int expected2 = 3;
        int expected3 = 5;
        int expected4 = 3;
        int expected5 = 127;
        int expected6 = 650;
        int expected7 = 115;
        int expected8 = 171;
        int expected9 = 135;
        int expected10 = 673;
        int expected11 = 108;
        int expected12 = 1582;
        int expected13 = 1;

        //When
        int actual1 = ChocolateFeast.chocolateFeast(10, 2, 5);
        int actual2 = ChocolateFeast.chocolateFeast(12, 4, 4);
        int actual3 = ChocolateFeast.chocolateFeast(6, 2, 2);
        int actual4 = ChocolateFeast.chocolateFeast(7, 3, 2);
        int actual5 = ChocolateFeast.chocolateFeast(38843, 304, 30098);
        int actual6 = ChocolateFeast.chocolateFeast(72878, 112, 50836);
        int actual7 = ChocolateFeast.chocolateFeast(97231, 842, 23730);
        int actual8 = ChocolateFeast.chocolateFeast(87025, 506, 24139);
        int actual9 = ChocolateFeast.chocolateFeast(3650, 27, 1247);
        int actual10 = ChocolateFeast.chocolateFeast(43100, 64,7862);
        int actual11 = ChocolateFeast.chocolateFeast(17778, 164, 16452);
        int actual12 = ChocolateFeast.chocolateFeast(55403, 35, 18329);
        int actual13 = ChocolateFeast.chocolateFeast(77016, 56185, 48740);
    }

}