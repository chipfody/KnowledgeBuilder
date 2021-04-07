package HackerRank;

public class MarsExploration {

    static int marsExploration(String s) {
        int changes = 0;
        for (int i = 0; i < s.length(); i += 3) {
            if (s.charAt(i) != 'S') changes++;
            if (s.charAt(i + 1) != 'O') changes++;
            if (s.charAt(i + 2) != 'S') changes++;
        }
        return changes;
    }
}
