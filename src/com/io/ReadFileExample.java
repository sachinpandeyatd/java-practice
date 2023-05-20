package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        // The path of the file to read
        String filePath = "new-file.txt";

        try {
            // Create a FileReader object with the file path
            FileReader fileReader = new FileReader(filePath);

            // Create a BufferedReader object to read the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            // Read each line of the file until the end
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader to free up resources
            bufferedReader.close();
        } catch (IOException e) {
            // Handle any exceptions that may occur
            e.printStackTrace();
        }
    }
}
