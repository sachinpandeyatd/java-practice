package com.oop.abstracts;

public class Daughter extends Parents{
    Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be an engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Y");
    }
}
