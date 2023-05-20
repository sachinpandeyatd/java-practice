package com.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store employee information
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Add employees to the HashMap
        employeeMap.put(1, new Employee("John Doe", 32, "Manager"));
        employeeMap.put(2, new Employee("Jane Doe", 27, "Developer"));
        employeeMap.put(3, new Employee("Jim Smith", 35, "Tester"));

        // Retrieve an employee from the HashMap
        Employee employee = employeeMap.get(1);
        System.out.println("Employee Information: " + employee);
    }
}

class Employee {
    private String name;
    private int age;
    private String role;

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Role: " + role;
    }
}
