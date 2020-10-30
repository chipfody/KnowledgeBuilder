package UdemyPuzzles;

public class addDollarSigns {

    public static String allDollars(String str) {

        if (str.length() <= 1) return str;

        return str.charAt(0) + "$" + allDollars(str.substring(1));
    }
}
