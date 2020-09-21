package HackerRank;

import java.math.BigDecimal;

public class BegDecimalComparison {

     for (int j = 0; j < n - 2; j++) {
        for (int k = 1; k < n - j; k++) {
            BigDecimal first = new BigDecimal(s[k - 1]);
            BigDecimal second = new BigDecimal(s[k]);
            if(second.compareTo(first) == 1){
                String temp = s[k];
                s[k] = s[k-1];
                s[k-1] = temp;
            }
        }
    }

}

