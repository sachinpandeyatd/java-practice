package com.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileExample2 {

    public static void main(String[] args) {
        File file = new File("new-file.txt");

        try {
            // Create input stream for file
            FileInputStream inputStream = new FileInputStream(file);
            // Wrap input stream in a BufferedInputStream for better performance
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            // Read the bytes from the file
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                // Convert bytes to a string and print to console
                String data = new String(buffer, 0, bytesRead);
                System.out.print(data);
            }

            // Close the input streams
            bufferedInputStream.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
