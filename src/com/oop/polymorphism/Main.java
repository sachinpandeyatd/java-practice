package com.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Shape square = new Square();
        Triangle triangle = new Triangle();

        square.area();
        circle.area();
        triangle.area();       
    }
}
