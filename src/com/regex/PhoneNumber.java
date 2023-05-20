package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        String a = "something";
        // create a pattern to match a phone number

        //String to search
        String stringForSearching = "My phone number is 7518693356";
        Pattern pattern1 = Pattern.compile("\\d{10}");

        //String jus tto match
        Pattern pattern2 = Pattern.compile("^\\d{10}$");
        String strignJustToMatch = "7518693356";

        // create a matcher to find the pattern in a string
        Matcher matcher = pattern1.matcher(stringForSearching);

        // loop through the matches and print them out
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println("Found match: " + match);
        }

        System.out.println(pattern2.matcher(strignJustToMatch).find());
    }
}
