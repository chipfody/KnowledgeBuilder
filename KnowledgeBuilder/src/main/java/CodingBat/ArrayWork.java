package CodingBat;

public class ArrayWork {


//    Given an array of scores, return true if each score is equal or greater than the one before.
//    The array will be length 2 or more.

    public static boolean scoresIncreasing(int[] scores) {
        boolean result = true;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
