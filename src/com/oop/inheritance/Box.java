package com.oop.inheritance;

public class Box {
    double h;
    double w;
    double l;

    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box oldBox){
        this.h = oldBox.h;
        this.w = oldBox.w;
        this.l = oldBox.l;
    }

    @Override
    public String toString() {
        return "com.oop.inheritance.Box{" +
                "h=" + h +
                ", w=" + w +
                ", l=" + l +
                '}';
    }
}
