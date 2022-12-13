package com.prac.oop.polymorphism.overrding;

public class OverridingMain {

    public static void main(String[] args) {

        Shape shape;
        shape = new Shape();
        shape.print();

        shape = new Circle();
        shape.print();

        shape = new Rectangle();
        shape.print();

        Shape.staticPrint();
        Circle.staticPrint();
    }
}
