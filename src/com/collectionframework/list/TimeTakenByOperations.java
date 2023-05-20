package com.collectionframework.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;

public class TimeTakenByOperations {

    /*

        Summary of the relative performance of ArrayList, LinkedList, and Vector in different situations:

        ArrayList:
            Fast for random access (using index) and retrieval operations (get method) due to its
            underlying structure as an array.
            Slow for insertions and deletions in the middle of the list due to the need to shift
            elements to make room.

        LinkedList:
            Fast for insertions and deletions anywhere in the list due to its doubly-linked structure.
            Slow for random access and retrieval operations (get method) due to the need to traverse
            the list to find the desired element.

        Vector:
            Synchronized, making it thread-safe, but at the cost of slower performance compared to
            ArrayList and LinkedList.
            Similar performance to ArrayList for random access and retrieval operations (get method).
            Similar performance to LinkedList for insertions and deletions anywhere in the list.

    */

    static final int N = 100000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();

        //populate the list
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            arrayList2.add(i);
            linkedList.add(i);
            vector.add(i);
        }

        //Measuring time taken by get operation
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList get operation: " + (endTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by LinkedList get operation: " + (endTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            vector.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by Vector get operation: " + (endTime - startTime) + " milliseconds.");

        //Measuring time taken by remove operation
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList remove operation: " + (endTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by LinkedList remove operation: " + (endTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            vector.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by Vector remove operation: " + (endTime - startTime) + " milliseconds.");
    }
}
