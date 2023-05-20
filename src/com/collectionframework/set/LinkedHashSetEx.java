package com.collectionframework.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("pear");

        System.out.println(set);
    }
}
