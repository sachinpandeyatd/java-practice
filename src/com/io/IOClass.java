package com.io;

import java.io.*;

public class IOClass {
    public static void main(String[] args) throws IOException {
        // Reading data using FileInputStream
        FileInputStream fileInputStream = new FileInputStream("input.txt");
        int data = fileInputStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileInputStream.read();
        }
        fileInputStream.close();

        // Writing data using FileOutputStream
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        String message = "Hello, this is an example.";
        byte[] messageBytes = message.getBytes();
        fileOutputStream.write(messageBytes);
        fileOutputStream.close();

        // Reading data using BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        // Writing data using BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output-file.txt"));
        bufferedWriter.write("Hello, this is an example using BufferedWriter.");
        bufferedWriter.close();

        // Reading data using InputStreamReader
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        char[] buffer = new char[100];
        int length = inputStreamReader.read(buffer);
        String input = new String(buffer, 0, length);
        System.out.println(input);
        inputStreamReader.close();

        // Writing data using OutputStreamWriter
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        outputStreamWriter.write("Hello, this is an example using OutputStreamWriter.");
        outputStreamWriter.flush();
        outputStreamWriter.close();

        // Reading data using Reader
        Reader reader = new FileReader("input.txt");
        int character = reader.read();
        while (character != -1) {
            System.out.print((char) character);
            character = reader.read();
        }
        reader.close();

        // Writing data using Writer
        Writer writer = new FileWriter("output.txt");
        writer.write("Hello, this is an example using Writer.");
        writer.close();
    }
}
