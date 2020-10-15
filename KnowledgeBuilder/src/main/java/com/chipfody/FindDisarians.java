package com.chipfody;

import java.util.ArrayList;
import java.util.List;

public class FindDisarians {

    public static ArrayList<Integer> findDisarians(int start, int end) {
        ArrayList<Integer> solution = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (DisarianNumber.isDisarian(i)) {
                solution.add(i);
            }
        }
        return solution;
    }
}
