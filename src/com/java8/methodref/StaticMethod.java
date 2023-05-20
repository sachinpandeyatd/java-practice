package com.java8.methodref;

// Functional interface with one argument
interface Calculator {
    int operate(int x);
}

class MathUtils {
    // Static method with one argument
    public static int square(int x) {
        return x * x;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Reference to static method MathUtils.square
        Calculator calc = MathUtils::square;

        // Call the method using the functional interface
        int result = calc.operate(5); // result = 25

        System.out.println(result);
    }
}
