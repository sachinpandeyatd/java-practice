package com.collectionframework.list;

import java.util.*;

public class ListPerformanceExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();

        // Populating lists with 100000 elements
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
            vector.add(i);
        }

        // Measuring performance of accessing elements at index 99999
        long startTime = System.nanoTime();
        int element = arrayList.get(99999);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Accessing element in ArrayList took: " + duration + " ns");

        startTime = System.nanoTime();
        element = linkedList.get(99999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Accessing element in LinkedList took: " + duration + " ns");

        startTime = System.nanoTime();
        element = vector.get(99999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Accessing element in Vector took: " + duration + " ns");

        // Measuring performance of inserting elements at index 50000
        startTime = System.nanoTime();
        arrayList.add(50000, 9999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Inserting element in ArrayList took: " + duration + " ns");

        startTime = System.nanoTime();
        linkedList.add(50000, 9999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Inserting element in LinkedList took: " + duration + " ns");

        startTime = System.nanoTime();
        vector.add(50000, 9999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Inserting element in Vector took: " + duration + " ns");
    }
}
