package com.exception;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
        }catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("No matter what, this will always execute.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("You can not divide by zero.");
        }
        return a/b;
    }
}
