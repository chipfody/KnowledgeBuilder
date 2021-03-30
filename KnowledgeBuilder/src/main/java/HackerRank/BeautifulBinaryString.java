package HackerRank;

public class BeautifulBinaryString {

    public static int beautifulBinarySting(String b) {

        StringBuilder sb = new StringBuilder(b);
        int count = 0;

        for (int i = 0; i <=sb.length() - 3; i++) {
            if (sb.substring(i, i + 3).equals("010")) {
                sb.replace(i + 2, i + 3, "1");
                count++;
            }
        }
        return count;
    }
}
