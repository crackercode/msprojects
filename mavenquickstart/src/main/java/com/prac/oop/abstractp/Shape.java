package com.prac.oop.abstractp;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        System.out.println("Shape constructor called");
        this.name = name;
    }

    public abstract void printShape();

    public void concrete(){
        System.out.println("concrete()");
    }

    public String getName() {
        return name;
    }

}
