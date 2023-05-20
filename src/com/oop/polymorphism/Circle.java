package com.oop.polymorphism;

public class Circle extends Shape{
	@Override
	void area() {
		System.out.println("Area of circle is pie * r * r");
	}
}