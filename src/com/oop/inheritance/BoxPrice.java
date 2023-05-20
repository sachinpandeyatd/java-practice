package com.oop.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice boxPrice){
        super(boxPrice.h, boxPrice.l, boxPrice.w, boxPrice.weight);
        this.cost = boxPrice.cost;
    }

    BoxPrice(double h, double l, double w, double weight, double cost){
        super(h, l, w, weight);
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "com.oop.inheritance.BoxPrice{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", h=" + h +
                ", w=" + w +
                ", l=" + l +
                '}';
    }
}
