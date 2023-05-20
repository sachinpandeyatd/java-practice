package com.collectionframework.list;

import java.util.*;

public class ListPerformance {

    private static final int N = 100000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(N);
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector = new Vector<>(N);

        // Fill the lists with the same data
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            linkedList.add(i);
            vector.add(i);
        }

        // Measure the time taken by get operation in ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.get(i);
        }
        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken by ArrayList get operation: " + timeTaken + " ns");

        // Measure the time taken by get operation in LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.println("Time taken by LinkedList get operation: " + timeTaken + " ns");

        // Measure the time taken by get operation in Vector
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            vector.get(i);
        }
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.println("Time taken by Vector get operation: " + timeTaken + " ns");

        // Measure the time taken by remove operation in ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.println("Time taken by ArrayList remove operation: " + timeTaken + " ns");

        // Measure the time taken by remove operation in LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.println("Time taken by LinkedList remove operation: " + timeTaken + " ns");

        // Measure the time taken by remove operation in Vector
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            vector.remove(0);
        }
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.println("Time taken by Vector remove operation: " + timeTaken + " ns");
    }
}
