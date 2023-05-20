package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchVowels {
    public static void main(String[] args) {
        String str = "hfdjghfdg";
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("String contains a vowel");
        } else {
            System.out.println("String does not contain a vowel");
        }
    }
}
