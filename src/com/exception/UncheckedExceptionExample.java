package com.exception;

public class UncheckedExceptionExample {
   public static void main(String[] args) {
      int[] array = {1, 2, 3};
      try {
         System.out.println(array[10]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array index out of bounds: " + e.getMessage());
      }
   }
}

//   Here are ten examples of unchecked exceptions:
//
//        java.lang.ArithmeticException
//        java.lang.NullPointerException
//        java.lang.ArrayIndexOutOfBoundsException
//        java.lang.IllegalArgumentException
//        java.lang.ClassCastException
//        java.lang.NegativeArraySizeException
//        java.lang.IllegalStateException
//        java.lang.NumberFormatException
//        java.util.NoSuchElementException
//        java.lang.StackOverflowError