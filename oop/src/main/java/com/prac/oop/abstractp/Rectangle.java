package com.prac.oop.abstractp;

public abstract class Rectangle extends Shape  {

    public String name;

    public Rectangle(String name, String rectangleName) {
        // calling Shape constructor
        super(name); // Mandatory
        System.out.println("Rectangle constructor called");
        this.name = rectangleName;
    }
}
