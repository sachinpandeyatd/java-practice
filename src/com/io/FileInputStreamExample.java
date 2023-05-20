package com.io;

import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            // Use FileInputStream to create an instance of object and provide a file path, which to be read
            FileInputStream fis = new FileInputStream("example.txt");
            int data; // To hold ASCII value of each character
            long startTime = System.currentTimeMillis(); //Returns the current value of the running JVM's high-resolution time source, in nanoseconds
            while ((data = fis.read()) != -1) { //Iterate through fis until it returns -1, and assign it to data
                System.out.print((char)data); // Type cast data's ASCII int values into char
            }
            long endTime = System.currentTimeMillis();
            fis.close();
            System.out.println(); 
  //           (endTime - startTime) will give how much time system took to do all the operations in between
            System.out.println("Time taken by FileInputStream to read: " + (endTime - startTime) + " ms");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------");

//            File file = new File("example.txt");
//            System.out.println(file.length());

            // Using BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"));
            startTime = System.currentTimeMillis();
            while ((data = bis.read()) != -1) {
                System.out.print((char)data);
            }
            endTime = System.currentTimeMillis();
            bis.close();
            System.out.println();
            System.out.println("Time taken by BufferedInputStream to read: " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
