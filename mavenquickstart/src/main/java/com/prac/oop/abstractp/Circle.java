package com.prac.oop.abstractp;

public class Circle extends Shape {

    private String name;

    public Circle(String name, String circleName) {
        // calling Shape constructor
        super(name); // Mandatory
        System.out.println("Circle constructor called");
        this.name = circleName;
    }

    public void printShape() {
        System.out.println("Super name : " + super.getName());
        System.out.println("name : " + name);
    }
}
