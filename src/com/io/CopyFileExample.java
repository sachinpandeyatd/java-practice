package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileExample {
  public static void main(String[] args) throws IOException {
    // Input file path
    String inputFilePath = "input-file.txt";
    // Output file path
    String outputFilePath = "output-file.txt";

    File file = new File(inputFilePath);

    if (!file.exists()) {
      //create a new file, if specified file doesn't exist
      file.createNewFile();
    }

    try {
      // Create a new input file stream
      FileInputStream inputFileStream = new FileInputStream(inputFilePath);
      // Create a new output file stream
      FileOutputStream outputFileStream = new FileOutputStream(outputFilePath);

      int bytesRead;
      // Buffer to hold the bytes read from input stream
      byte[] buffer = new byte[4096];
      // Read bytes from input stream and write to output stream until end of file
      while ((bytesRead = inputFileStream.read(buffer)) != -1) {
        outputFileStream.write(buffer, 0, bytesRead);
      }

      // Close the input and output streams
      inputFileStream.close();
      outputFileStream.close();

      System.out.println("File copied successfully.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
