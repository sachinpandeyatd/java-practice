package com.java8.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        List<String> longWords = words.stream().filter((w) -> (w.length() > 4)).collect(Collectors.toList());

        System.out.println(longWords);
    }
}
