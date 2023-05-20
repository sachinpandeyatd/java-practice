package com.java8.defaultmethod;

interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
