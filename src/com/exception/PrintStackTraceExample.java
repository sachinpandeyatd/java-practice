package com.exception;

public class PrintStackTraceExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
