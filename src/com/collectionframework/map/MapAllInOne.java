package com.collectionframework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
    Imagine you have a bunch of toys, and you want to put them in different boxes.

    HashMap is like a box where you just throw all the toys in, and when you want to find a toy,
    you have to dig through the box to find it. It's fast to add toys and fast to search for toys,
    but the toys won't be in any particular order.

    TreeMap is like a box where you put the toys in a specific order, like smallest to biggest, or
    alphabetically by name. When you want to find a toy, you have to look through the box one by one,
    starting from the first toy. It's slower to add toys, but it's easy to find toys because they
    are in order.

    LinkedHashMap is like a box where you put the toys in the order that you add them. When you want to
    find a toy, you can find it fast, like in a HashMap. But unlike HashMap, the toys will be in the order
    that you added them, so it's easy to see which toy you added first, second, and so on.

    Technical Difference -
    HashMap: It stores key-value pairs in a hash table.
    TreeMap: It stores key-value pairs in a sorted order, based on the key.
    LinkedHashMap: It stores key-value pairs in the order in which they were inserted,
    but also provides fast access like HashMap.

    HashSet and LinekdHashSet allow single null value, while TreeMap does not.
 */

public class MapAllInOne {
    public static void main(String[] args) {
        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Toy 1", 1);
        hashMap.put("Toy 2", 2);
        hashMap.put("Toy 3", 3);
        System.out.println("HashMap: " + hashMap);

        // TreeMap example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Toy 1", 1);
        treeMap.put("Toy 3", 2);
        treeMap.put("Toy 2", 2);
        System.out.println("TreeMap: " + treeMap);

        // LinkedHashMap example
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Toy 1", 1);
        linkedHashMap.put("Toy 3", 3);
        linkedHashMap.put("Toy 2", 2);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
