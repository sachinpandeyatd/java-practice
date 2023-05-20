package com.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the map
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);

        // Printing the map
        System.out.println(map);

        // Accessing the value for a specific key
        int bananaValue = map.get("banana");
        System.out.println("The value for banana is: " + bananaValue);
    }
}
