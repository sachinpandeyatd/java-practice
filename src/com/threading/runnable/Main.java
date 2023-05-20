package com.threading.runnable;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++){
            RunnableEx runnableEx = new RunnableEx(i);
            Thread thread1 = new Thread(runnableEx);
            Thread thread2 = new Thread(runnableEx);

            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
        }
    }
}
