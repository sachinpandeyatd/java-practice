package com.exception;

public class StackTraceExample {

    public static void main(String[] args) {
        printStackTrace();
    }

    private static void printStackTrace() {
        printStackTrace();
    }
}
