package com.oop.abstracts;

public class Son extends Parents{
    Son(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be an astronaut");
    }

    @Override
    void partner() {
        System.out.println("I love X");
    }
}
