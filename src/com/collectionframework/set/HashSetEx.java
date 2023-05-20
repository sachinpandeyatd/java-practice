package com.collectionframework.set;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<String>();

        // Add elements to the set
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("tiger");
        set.add("lion");

        // Try to add duplicate elements
        set.add("dog");
        set.add("cat");

        // Display the elements in the set
        System.out.println("Elements in the set: " + set);
        for (String element : set) {
            int hashCode = element.hashCode();
            System.out.println("Hash code of " + element + " is: " + hashCode);
        }
    }
}
