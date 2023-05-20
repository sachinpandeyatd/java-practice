package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EditFileExample {

  public static void main(String[] args) {
    try {
      File file = new File("new-file.txt");

      // create a FileWriter instance with append mode set to true
      FileWriter writer = new FileWriter(file, true);

      // write some text to the file
      writer.write("Never gonna give you up");

      // close the writer to free up system resources
      writer.close();

      System.out.println("File updated successfully!");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
