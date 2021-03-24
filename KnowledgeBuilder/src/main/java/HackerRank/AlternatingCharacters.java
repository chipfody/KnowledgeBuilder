package HackerRank;

/*
You are given a string containing characters A and B only. Your task is to change it into a string such that
 there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.
 Your task is to find the minimum number of required deletions.
*/

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        int removed = 0;

        if (s.length() == 0 || s.length() == 1) {
            return 0;
        }else {
            int test = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(test) == s.charAt(i)) {
                    removed++;
                }else {test = i;}
            }
        }
        return removed;
    }
}
