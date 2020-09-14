package HackerRank;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunWithAnagrams {

    public static boolean isAnagram(String word1, String word2) {
        boolean isAnag;
        if (word1.length() != word2.length()) {
            isAnag = false;
        } else {
            char[] sort1 = word1.toCharArray();
            char[] sort2 = word2.toCharArray();
            Arrays.sort(sort1);
            Arrays.sort(sort2);

            isAnag = Arrays.equals(sort1, sort2);
        }

        return isAnag;
    }
    public static void funWithAnagrams(List<String> text) {
        for (int i = 0; i < text.size() - 1; i++) {
            for (int j = i + 1; j < text.size(); j++) {
                if (isAnagram(text.get(i), text.get(j))) {
                    text.remove(j);
                    j--;
                }
            }
        }
        Collections.sort(text);
    }

    public static void main (String[]args){

            List<String> text = new ArrayList<String>();
            text.add("code");
            text.add("aaagmnrs");
            text.add("ana");
            text.add("doce");
//
            funWithAnagrams(text);

            System.out.println(text);
        }

}
