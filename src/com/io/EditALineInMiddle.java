package com.io;

import java.io.*;

public class EditALineInMiddle {
   public static void main(String[] args) throws IOException {
      // Open the file in read mode and read all the lines into a list
      File file = new File("example.txt");
      BufferedReader reader = new BufferedReader(new FileReader(file));

      String line;
      int lineNumber = 3; // the line number you want to modify
      int currentLine = 1;

      StringBuilder stringBuilder = new StringBuilder();

      while ((line = reader.readLine()) != null) {
         if (currentLine == lineNumber) {
            // Make the necessary changes to the line
            line = "Rickrolling is skill";
         }
         stringBuilder.append(line);
         stringBuilder.append(System.getProperty("line.separator")); // add new line character, (\r\n -> windows, \n -> Linux/mac)
         currentLine++;
      }
      reader.close();

      // Open the file in write mode and write the modified lines back to the file
      BufferedWriter writer = new BufferedWriter(new FileWriter(file));
      writer.write(stringBuilder.toString());
      writer.close();
   }
}
