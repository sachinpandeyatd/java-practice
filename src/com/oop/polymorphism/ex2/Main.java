package com.oop.polymorphism.ex2;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.deviceName();
        mouse.takeInput();

        Stylus stylus = new Stylus();
        stylus.deviceName();
        stylus.takeInput();
    }
}
