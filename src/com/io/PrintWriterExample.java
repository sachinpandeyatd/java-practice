package com.io;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("print-example.txt");

        String data = "Never gonna give you up";
        printWriter.println(data);
        System.out.println();
        printWriter.close();
    }
}
