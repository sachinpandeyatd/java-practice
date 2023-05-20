package com.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.start();
        tesla.stop();
        tesla.acc();
        tesla.brake();
        tesla.stop();
        tesla.start();

        String a = "sachin";
        String b = new String("sachin");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);
    }
}
