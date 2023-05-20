package com.x;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class X2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "apple");
        map.put(5, "pear");
        map.put(6, "banana");
        map.put(7, "orange");

        // Create a set of unique values
        Set<String> uniqueValues = new HashSet<>(map.values());

        // Create a new map with unique values
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (uniqueValues.contains(entry.getValue())) {
                uniqueValues.remove(entry.getValue());
                newMap.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Original Map: " + map);
        System.out.println("Map with unique values: " + newMap);
    }
}
