package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FileReaderExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Create FileReader object
        FileReader fileReader = new FileReader("example.txt");
        int data;
        while((data = fileReader.read()) != -1){
            System.out.print((char) data);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");


        // Create BufferedReader object to wrap FileReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"));

        // Read the file line by line
        String line;
        long startTime = System.nanoTime();
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Time taken by buffered reader: " + (endTime - startTime) + " ns");


        List<String> s = bufferedReader.lines().collect(Collectors.toList());
        s.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


        // Close the BufferedReader and FileReader
        bufferedReader.close();
        fileReader.close();
    }
}
