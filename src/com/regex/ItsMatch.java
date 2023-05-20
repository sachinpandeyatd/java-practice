package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItsMatch {
    public static void main(String[] args) {
        // Define a regular expression pattern
        Pattern pattern = Pattern.compile("\\d+");

        // Create a matcher object for the input string
        String input = "123 never gonna 456 give you up, 678 never gonna 890 let you down";
        Matcher matcher = pattern.matcher(input);

        // Use find() to search for the pattern in the input string
        // and print out the matching string and its start and end positions
        while (matcher.find()) {
            String match = matcher.group();
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Match found: " + match + " (start = " + start + ", end = " + end + ")");
        }

        // Use matches() to check if the entire input string matches the pattern
        boolean matches = matcher.matches();
        System.out.println("Input string matches pattern: " + matches);

        // Use replaceFirst() to replace all occurrences of the pattern in the input string
        String replacedFirst = matcher.replaceFirst("REPLACED_FIRST");
        System.out.println("Input string with replace first: " + replacedFirst);

        // Use replaceAll() to replace all occurrences of the pattern in the input string
        String replacedAll = matcher.replaceAll("REPLACED_ALL");
        System.out.println("Input string with replace all: " + replacedAll);
    }
}
