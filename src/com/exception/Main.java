package com.exception;

public class Main {
    public static void main(String[] args) {
//        String name = "Sachin";
//
//        if (name.equals("Sachin")){
//            try {
//                throw new MyException("Name is Sachin.");
//            } catch (MyException e) {
//                System.out.println(e.getMessage());;
//            }
//        }

        int a = 10;
        int b = 0;

        try {
            if (b == 0) {
                throw new MyException("You can not divide by zero.");
            }
            int c = a/b;
        }catch (MyException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
