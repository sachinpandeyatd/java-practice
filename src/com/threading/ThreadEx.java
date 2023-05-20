package com.threading;

import java.util.Map;

public class ThreadEx extends Thread{
    public static void main(String[] args) {
//        System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//
    	Map<Thread, StackTraceElement[]> allThreads = Thread.getAllStackTraces();
    	for (Thread t : allThreads.keySet()) {
    		System.out.println(t);
    	}

//        Thread[] allThreads = new Thread[Thread.activeCount()];
//        int n = Thread.enumerate(allThreads);
//        for (int i = 0; i < n; i++) {
//            Thread t = allThreads[i];
//            if (t.isAlive()) {
//                System.out.println("Active Thread: " + t.getName());
//            }
//        }

//        System.out.println(Thread.currentThread().isAlive());
    }
}
