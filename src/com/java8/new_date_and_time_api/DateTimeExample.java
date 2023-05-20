package com.java8.new_date_and_time_api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Create a date using the current system date
        LocalDate date = LocalDate.now();
        System.out.println("Today's date: " + date);

        // Create a time using the current system time
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        // Combine the date and time into a LocalDateTime
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Combined date and time: " + dateTime);

        // Format the date and time using a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}
