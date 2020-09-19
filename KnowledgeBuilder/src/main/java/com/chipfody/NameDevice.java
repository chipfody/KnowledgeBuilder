package com.chipfody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class NameDevice {

    public static void increment(Map<String, Integer> inventory, String key) {
        inventory.putIfAbsent(key, 0);
        inventory.put(key, inventory.get(key) + 1);
    }

    public static void main(String[] args) {
        String[] devices = new String[] {"switch", "tv", "switch", "tv", "switch", "tv"};
        Map<String, Integer> inventory = new HashMap<String, Integer>();
        for (int i = 0; i < devices.length; i++) {
            increment(inventory, devices[i]);
            if (inventory.get(devices[i]) != 1) {
                devices[i] = devices[i] + (inventory.get(devices[i]) - 1);
            }
        }

        System.out.println(Arrays.toString(devices));

    }
}
