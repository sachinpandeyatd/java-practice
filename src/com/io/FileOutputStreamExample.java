package com.io;

import java.io.*;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String data = "I am Sachin";
        try {
            // Writing data using FileOutputStream
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write(data.getBytes());
            fos.close();

            // Writing data using BufferedOutputStream
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output_buffered.txt"));
            bos.write(data.getBytes());
            bos.close();

            FileInputStream fis = new FileInputStream("output.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int readData;
            while((readData = bis.read()) != -1){
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
