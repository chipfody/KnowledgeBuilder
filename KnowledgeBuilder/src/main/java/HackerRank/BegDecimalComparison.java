package HackerRank;

/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
        Given an array,s, of n real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g. .1 = 0.1 ), then they must be listed in the same order as they were received as input).
        Complete the code in the unlocked section of the editor below. You must rearrange array s's elements according to the instructions above.
*/


import java.math.BigDecimal;

//public class BegDecimalComparison (String[] s) {
//
//     for (int j = 0; j < s.length - 2; j++) {
//        for (int k = 1; k < s.length - j; k++) {
//            BigDecimal first = new BigDecimal(s[k - 1]);
//            BigDecimal second = new BigDecimal(s[k]);
//            if(second.compareTo(first) == 1){
//                String temp = s[k];
//                s[k] = s[k-1];
//                s[k-1] = temp;
//            }
//        }
//    }
//
//}

