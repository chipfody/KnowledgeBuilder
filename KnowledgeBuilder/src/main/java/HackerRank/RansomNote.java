package HackerRank;

import java.util.Hashtable;

public class RansomNote {

    static String checkMagazine(String[] magazine, String[] note) {

        String result = "Temp";
        Hashtable<String, Integer> magWords = new Hashtable<>();

        for (int i = 0; i < magazine.length; i++) {
            String word = magazine[i];
            if (magWords.contains(word)) {
                magWords.put(word, magWords.get(word) + 1);
            } else {
                magWords.put(word, 1);
            }
        }

        for (String noteWord : note) {
            if (!magWords.containsKey(noteWord) || magWords.get(noteWord) == 0) {
                result = "No";
                break;
            } else {
                magWords.put(noteWord, magWords.get(noteWord) - 1);
                result = "Yes";
            }
        }
        return result;
    }
}
