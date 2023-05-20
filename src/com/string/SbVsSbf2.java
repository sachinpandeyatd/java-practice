package com.string;

public class SbVsSbf2 {

    static StringBuilder sb = new StringBuilder();
    static StringBuffer sbf = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {
        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 21; i++) {
                sb.append(i);
                sbf.append(i);
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 21; i++) {
                sb.append(i);
                sbf.append(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("StringBuilder: " + sb.length());
        System.out.println("StringBuffer : " + sbf.length());
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer : " + sbf);
    }
}
