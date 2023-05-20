package com.oop.encapsulation;

public class Laptop extends Computer{
    private String model;
    private int memory;
    private int storage;


    //encapsulation
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    //abstraction
    @Override
    public void start() {

    }

    @Override
    public void shutDown() {

    }

    @Override
    public void restart() {

    }
}
