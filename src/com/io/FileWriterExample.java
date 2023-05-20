package com.io;

import java.io.*;

public class FileWriterExample {

    public static void main(String[] args) {
        String filename = "test.txt";
        String content = "I am Sachin";

        try {
            // Using FileWriter
//            FileWriter fileWriter = new FileWriter(filename);
//            fileWriter.write(content);
//            fileWriter.close();

            // Using BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
            bufferedWriter.write(content);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
