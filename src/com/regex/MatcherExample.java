package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {
    public static void main(String[] args) {
        String text = "Never gonna give you up, never gonna let you down";
        Pattern pattern = Pattern.compile("\\b\\w{4}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group();
            int start = matcher.start();
            int end = matcher.end();

            System.out.println("Found match: " + word + " at index " + start + "-" + (end - 1));

            // Print the substring that matches the pattern
            System.out.println("Matched substring: " + text.substring(start, end));
        }
    }
}
