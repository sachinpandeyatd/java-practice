package com.java8.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapItOut {
    public static void main(String[] args) {
        // Create a new List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        for (Integer n : numbers){
            int cube = n * n * n;
        }

        List<Integer> cubes = numbers.stream()
                .map(n -> n * n * n) // Cube all elements, n^3 = n*n*n
                .collect(Collectors.toList()); // Create a new list of cube of all elements

        cubes.stream().forEach(System.out::println);
    }
}
