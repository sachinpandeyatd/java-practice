package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        //Create List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filter all even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter((n) -> (n % 2 == 0)) // if a number is totally divided by 2
                .collect(Collectors.toList()); // Create a new list of all filtered elements
        System.out.println(evenNumbers);
    }

}
