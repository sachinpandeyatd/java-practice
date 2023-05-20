package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
   public static void main(String[] args) {
      File file = new File("test.txt");
      try {
         Scanner scanner = new Scanner(file);
      } catch (FileNotFoundException e) {
         System.out.println("File not found: " + e.getMessage());
      }
   }
}

//   Here are ten examples of checked exceptions:
//
//        java.io.FileNotFoundException
//        java.io.EOFException
//        java.io.IOException
//        java.sql.SQLException
//        java.net.UnknownHostException
//        java.text.ParseException
//        java.lang.reflect.InvocationTargetException
//        java.security.NoSuchAlgorithmException
//        java.nio.charset.UnsupportedCharsetException
//        javax.xml.parsers.ParserConfigurationException
