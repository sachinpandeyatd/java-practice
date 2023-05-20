package com.oop.interfaces;

public class Car implements Brake, Engine{

    @Override
    public void brake() {
        System.out.println("I stop the car");
    }

    @Override
    public void start() {
        System.out.println("I start the car");
    }

    @Override
    public void stop() {
        System.out.println("I turn off the car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate the car");
    }
}
