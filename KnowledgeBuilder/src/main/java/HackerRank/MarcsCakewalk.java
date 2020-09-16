package HackerRank;

//   Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count, and Marc can walk a distance to expend those calories. If Marc has eaten j cupcakes so far,
//   after eating a cupcake with c calories he must walk at least (2^j) x c miles to maintain his weight.
//
//   For example, if he eats 3 cupcakes with calorie counts in the following order: [5, 10, 7], the miles he will need to
//    walk are (5 * 2^0) + (10 + 2^1) + (7 * 2^2) = 53. This is not the minimum, though, so we need to test other orders of consumption. In this case, our minimum miles
//    is calculated as (10 * 2^0) + (7 * 2^1) + (5 * 2^2) = 44.
//
//    Given the individual calorie counts for each of the cupcakes, determine the minimum number of miles Marc must walk to maintain his weight.
//    Note that he can eat the cupcakes in any order.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk {

    static long marcsCakewalk(int[] calorie) {
        long miles = 0;
        int last = calorie.length;
        Arrays.sort(calorie);

        for (int i = 0; i < last; i++) {
            miles += calorie[(last - 1) - i] * Math.pow(2, i);
        }
        return miles;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

