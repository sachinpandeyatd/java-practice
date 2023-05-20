package com.oop.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double h, double w, double l, double weight) {
        super(h, w, l);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "com.oop.inheritance.BoxWeight{" +
                "weight=" + weight +
                ", h=" + h +
                ", w=" + w +
                ", l=" + l +
                '}';
    }
}
