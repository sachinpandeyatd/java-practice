package com.typeconversion.customClassConversion;

class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
    void scratch() {
        System.out.println("Cat Scratches");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound();

        // type casting b to Cat
        Cat c = (Cat)b;
        c.scratch();
    }
}

