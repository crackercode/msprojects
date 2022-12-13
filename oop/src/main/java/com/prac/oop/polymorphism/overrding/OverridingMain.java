package com.prac.oop.polymorphism.overrding;

public class OverridingMain {

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.print();
        shape.staticPrint();

        Shape circle = new Circle();
        circle.print();
        circle.staticPrint();

        Shape rectangle = new Rectangle();
        rectangle.print();
        rectangle.staticPrint();

//        Shape shape2 = new Shape();
//        shape2.staticPrint();
//
//        Circle circle2 = new Circle();
//        circle.staticPrint();
    }
}
