package com.io;

import java.io.*;

public class CopyEntireContentInAnotherFile {
    public static void main(String[] args) throws IOException {
        String sourceFile = "example.txt"; // content of this file will be copied into destFile
        String destFile = "example-copy.txt"; // content of sourceFile will be copied into this file

        InputStream inputStream = new FileInputStream(sourceFile); // Create this object to read sourceFile
        OutputStream outputStream = new FileOutputStream(destFile); // Create this object to write destFile

        int length; // declare a variable to hold the current iterated data from sourceFile
        byte[] buffer = new byte[1024]; // Create a buffer of 1 KiB for better performance

        //Iterating through sourceFile, and if it greater than 0 (returns -1 on eof), then reassign to length
        System.out.println(inputStream.read(buffer));
        while ((length = inputStream.read(buffer)) > 0) {
        	System.out.println(length);
            outputStream.write(buffer, 0, length); // Fill the created buffer, starting from 0th index,
                // and length specifies the number of bytes to be written from the buffer to the output stream,
                // then write that into the destFile
        }

        inputStream.close();
        outputStream.close();
    }
}
