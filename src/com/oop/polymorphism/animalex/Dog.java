package com.oop.polymorphism.animalex;

import java.io.Serializable;

public class Dog extends Animal{
	@Override
	void makeSound(){
		System.out.println("Bark");
	}
}
