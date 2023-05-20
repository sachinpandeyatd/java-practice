package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class ReadImageUsingBase64 {
    public static void main(String[] args) throws IOException {
        String filename = "favicon.ico";
        File file = new File(filename);

        // read image file into a byte array
        byte[] imageBytes = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(imageBytes);
        fileInputStream.close();

        // encode image data in Base64
        String encodedImage = Base64.getEncoder().encodeToString(imageBytes);

        // print the encoded image to console
        System.out.println(encodedImage);
    }
}
