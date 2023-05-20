package com.threading;

public class ThreadStart {
  static StringBuilder sb = new StringBuilder();

  static long firstAction;

  public static void main(String[] args) throws InterruptedException {
    
      Thread t1 = new Thread(() -> firstAction = System.nanoTime());
      long starting = System.nanoTime();
      t1.start();
      int length = sb.length();
      long afterReadingLength = System.nanoTime();
      String s = "StringBuilder: " + length;
      long afterConcatenation = System.nanoTime();
      System.out.println(s);
      long andPrintln = System.nanoTime();
      t1.join();

      System.out.printf("time until %-20s %,d ns%n",
                        "thread's 1st action", firstAction - starting);
      System.out.printf("time until %-20s %,d ns%n",
                        "reading sb.length()", afterReadingLength - starting);
      System.out.printf("time until %-20s %,d ns%n",
                        "string concatenation", afterConcatenation - starting);
      System.out.printf("time until %-20s %,d ns%n",
                        "println completion", andPrintln - starting);
  }
}