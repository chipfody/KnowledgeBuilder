package HackerRank;

import java.util.Scanner;

class JavaAnagrams {


    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean anagram = false;
        if (a.length() != b.length()) {
            anagram = false;
        } else {
            String sortA = sorted(a.toLowerCase());
            String sortB = sorted(b.toLowerCase());
            for (int i = 0; i < sortA.length(); i++) {
                if (sortA.charAt(i) != sortB.charAt(i)) {
                    anagram = false;
                    break;
                } else anagram = true;
            }
        }
        return anagram;
    }

    static String sorted (String s) {
        int count = s.length();
        char[] str = s.toCharArray();
        char temp = ' ';
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++)
            {
                if (str[i] > (str[j]))
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String a = scan.next();
        System.out.println("Please enter another word to test: ");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}