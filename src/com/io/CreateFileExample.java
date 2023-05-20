package com.io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
  public static void main(String[] args) {
    try {
      //Create new instance of file and specify a file
      File file = new File("example.txt");

      if (!file.exists()) {
        //create a new file, if specified file doesn't exist
        file.createNewFile();
        System.out.println("File created: " + file.getName());
      } else {
        System.out.println("File already exists.");
      }

      //Print name of the file
      System.out.println("Name of the file is " + file.getName());

      //Check if this is a file or not
      System.out.println("If file or not - " + file.isFile());

      //Get the path
      System.out.println("Path of the " + file.getName() + " is " + file.getAbsolutePath());

      //Get length of the file
      System.out.println("Length of the file is " + file.length() + " bytes");

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();

    }

  }
}
