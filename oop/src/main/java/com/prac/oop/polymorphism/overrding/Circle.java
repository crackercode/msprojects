package com.prac.oop.polymorphism.overrding;

public class Circle extends Shape {

    public static void staticPrint(){
        System.out.println("Circle staticPrint");
    }
    public void print() {
        System.out.println("Circle");
    }
}

