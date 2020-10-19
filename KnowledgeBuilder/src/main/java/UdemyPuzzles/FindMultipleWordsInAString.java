package UdemyPuzzles;

import java.util.ArrayList;

public class FindMultipleWordsInAString {

    // In the first example, we are looking for the word immediately following a particular word

    public static ArrayList<String> findMatches(String sentence, String searchWord) {

        int index = 0;
        ArrayList<String> solution = new ArrayList<>();

        while (true) {
            int match = sentence.indexOf(searchWord, index); //looks for an occurrence of the searched word starting at position "index"
            if (match == -1)  // if no match is found, exit "while" loop
                break;
            int begin = match + searchWord.length(); // if found, notes the index of the beginning of the (first) searched word
            int end = sentence.indexOf(" ", begin); //finds the end of the word by noting the trailing space
            solution.add(sentence.substring(begin, end)); //adds the word to the arraylist
            index = end + 1; //resets the index to the first space after the found word
        }
        return solution;
    }

    public
}
