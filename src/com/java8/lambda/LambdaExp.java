package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExp {
    public static void main(String[] args) {
        //Create List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // With Conventional method
//        for (int i = 0; i < numbers.size(); i++) {
//            int num = numbers.get(i);
//            int square = num * num;
//            System.out.println(square);
//        }

        // Print square of all elements of the List using .forEach()
        numbers.forEach((num) -> System.out.println(num * num));


    }
}
