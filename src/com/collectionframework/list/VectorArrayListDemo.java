package com.collectionframework.list;

import java.util.ArrayList;
import java.util.Vector;

class VectorArrayListDemo extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Vector<Integer> vector = new Vector<Integer>();
        int MAX = 50000;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < MAX; i++) {
                arrayList.add(i);
                vector.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < MAX; i++) {
                arrayList.add(i);
                vector.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("Vector size: " + vector.size());
    }
}
