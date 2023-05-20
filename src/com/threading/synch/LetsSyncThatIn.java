package com.threading.synch;

public class LetsSyncThatIn {
    static StringBuilder sb = new StringBuilder();
    static StringBuffer sbf = new StringBuffer();

    public static synchronized void appendToStringBuilder(int i) {
        sb.append(i);
    }

    public static synchronized void appendToStringBuffer(int i) {
        sbf.append(i);
    }

    public static void main(String[] args) throws InterruptedException {
        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 24; i++) {
                appendToStringBuilder(i);
                appendToStringBuffer(i);
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 24; i++) {
                appendToStringBuilder(i);
                appendToStringBuffer(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("StringBuilder: " + sb.length());
        System.out.println("StringBuffer: " + sbf.length());
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer : " + sbf);
    }
}
