package com.java8.methodref;

// Functional interface with one argument
interface PersonName {
    String getName(Person p);
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Instance method that returns the name of the person
    public String getName() {
        return name;
    }
}

public class InstanceMethod {
    public static void main(String[] args) {
        // Reference to instance method Person.getName
        Person p = new Person("Sachin Pandey");
        PersonName personName = Person::getName;

        // Call the method using the functional interface
        String name = personName.getName(p); // name = "John"
        System.out.println(name);
    }
}
