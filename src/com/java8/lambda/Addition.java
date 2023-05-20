package com.java8.lambda;

interface Adder {
    int add(int a, int b);
}

public class Addition {
    public static void main(String[] args) {
        Adder adder = (a, b) -> a + b;
        System.out.println(adder.add(5, 3)); // Output: 8
    }
}
