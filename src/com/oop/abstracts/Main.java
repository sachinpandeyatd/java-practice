package com.oop.abstracts;

public class Main {
    public static void main(String[] args) {
        Son sachin = new Son(22);
        Daughter jyoti = new Daughter(15);

        sachin.career();
        sachin.partner();
        jyoti.career();
        jyoti.partner();

    }
}
