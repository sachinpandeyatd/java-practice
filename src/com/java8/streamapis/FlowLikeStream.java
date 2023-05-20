package com.java8.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlowLikeStream {

    public static void main(String[] args) {
        
        // Creating a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 8, 7);

        // Using distinct() to remove duplicates
        System.out.println("Distinct numbers: " + (numbers.stream().distinct().collect(Collectors.toList())));

        // Using skip() to skip the first 2 elements
        System.out.println("Skip first 2 numbers: " + (numbers.stream().skip(2).collect(Collectors.toList())));

        // Using limit() to limit the number of elements to 3
        System.out.println("Limit to 3 numbers: " + (numbers.stream().limit(3).collect(Collectors.toList())));

        // Using count() to get the count of elements
        long count = numbers.stream().count();
        System.out.println("Number of elements: " + count);

        // Using sorted() to sort the elements
        System.out.println("Sorted numbers: " + (numbers.stream().sorted().collect(Collectors.toList())));
    }
}
