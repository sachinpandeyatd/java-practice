package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        // Matching a specific string
        String input = "hello world";
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Match found!");
        }

        // Matching a specific character
        input = "hello world";
        pattern = Pattern.compile("l");
        matcher = pattern.matcher(input);
        System.out.println("---------------------------------------");
        while (matcher.find()) {
            System.out.println("Match found at index " + matcher.start());
        }

        // Matching one or more characters
        input = "hello world";
        pattern = Pattern.compile("lo+");
        matcher = pattern.matcher(input);
        System.out.println("---------------------------------------");
        while (matcher.find()) {
            System.out.println("Match found at index " + matcher.start());
        }

        // Matching zero or more characters
        input = "hello world";
        pattern = Pattern.compile("l*");
        matcher = pattern.matcher(input);
        System.out.println("---------------------------------------");
        while (matcher.find()) {
            System.out.println("Match found at index " + matcher.start());
        }

        // Matching a word boundary
        input = "hello world";
        pattern = Pattern.compile("\\bworld\\b");
        matcher = pattern.matcher(input);
        System.out.println("---------------------------------------");
        if (matcher.find()) {
            System.out.println("Match found!");
        }

        // Matching a digit
        input = "12345";
        pattern = Pattern.compile("\\d");
        matcher = pattern.matcher(input);
        System.out.println("---------------------------------------");
        while (matcher.find()) {
            System.out.println("Match found at index " + matcher.start());
        }
    }

}
