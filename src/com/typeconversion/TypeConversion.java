package com.typeconversion;

public class TypeConversion {
    public static void main(String[] args) {
        byte a = 100;
        long b = 2147483649L;

        double e = 1000.99999;

        byte c = (byte) b;
        int d = (int) e;

        int f = 432;
        String g = f + "";
        System.out.println(d);

//        System.out.println((int) 'ञ');
//        for (int i = 0; i < 100000; i++){
//            System.out.println((char) i);
//        }

        float aa = 10.323f;
        int ff = (int)aa;
        System.out.println((char) 34);
        System.out.println((char) 65601);
        Integer integer = 12;
    }
}
