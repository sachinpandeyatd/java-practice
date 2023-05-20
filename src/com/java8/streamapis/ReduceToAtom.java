package com.java8.streamapis;

import java.util.Arrays;
import java.util.List;

public class ReduceToAtom {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 15, 6, 11, 8, 9, 10);

        // using reduce to get the sum of all numbers
        int sum = numbers.stream().reduce(0,  // identity/initial value of accumulator is supposed to be 0
                ((acc, curr) -> acc + curr) // add curr value in acc on every iteration
        );

        System.out.println("Sum of all numbers: " + sum);

        int max = numbers.stream().reduce(Integer.MIN_VALUE, // Take smallest possible value of int, i.e. -2147483648
                (acc, curr) -> (curr > acc) ? curr : acc); // if curr is greater than acc, then acc = curr

        System.out.println("Max value is: " + max);
    }
}
