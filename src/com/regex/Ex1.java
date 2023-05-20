package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        String emailList = "john@example.com, mary@example.com, peter@example.com, alice@example.com, sachin@sa.com";
        String pattern = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(emailList);

        while (matcher.find()) {
            String email = matcher.group();
            System.out.println(email);
        }
    }
}
