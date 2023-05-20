package com.io;

import java.io.*;
import java.util.Arrays;

public class ReadImage {
    public static void main(String[] args) throws IOException {
        String imageName = "favicon.ico";
        File imageFileObject = new File(imageName);
        FileInputStream imageInputStreamObject = new FileInputStream(imageFileObject);
//        BufferedInputStream imageBufferedStreamObject = new BufferedInputStream(imageInputStreamObject);
//
//        int byteData;
//        while((byteData = imageBufferedStreamObject.read()) != -1){
//            System.out.print((char) byteData + " ");
//        }

        // Create a BufferedInputStream to buffer the input stream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(imageInputStreamObject);

        // Create a byte array to hold the image data
        byte[] imageData = new byte[bufferedInputStream.available()];
//        System.out.println(Arrays.toString(imageData));

        // Read the image data into the byte array
        bufferedInputStream.read(imageData);

        // Display the image
        System.out.write(imageData);

        // Close the streams
        bufferedInputStream.close();
        imageInputStreamObject.close();
    }
}
