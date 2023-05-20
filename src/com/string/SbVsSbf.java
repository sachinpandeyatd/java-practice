package com.string;

class StringConcatenation implements Runnable {
    private StringBuilder sb;
    private StringBuffer sbf;
    public StringConcatenation(StringBuilder sb,StringBuffer sbf) {
        this.sb = sb;
        this.sbf = sbf;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            sbf.append(i);
        }
    }
}

public class SbVsSbf {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();
        Thread t1 = new Thread(new StringConcatenation(sb,sbf));
        Thread t2 = new Thread(new StringConcatenation(sb,sbf));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("StringBuilder: " + sb.length());
        System.out.println("StringBuffer: " + sbf.length());

        "sachin".equals("sachin");
    }
}
