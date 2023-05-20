package com.threading;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            Threading thread = new Threading(i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
