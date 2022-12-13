package com.prac.oop.abstractp;

public abstract class AbstractMain {

    public static void main(String[] args) {

//        Shape shape = new Shape();abstract; cannot be instantiated
//        Circle circleShape = new Shape();  is abstract; cannot be instantiated
        Shape shapeCircle = new Circle("parentCircle - shapeCircle","circleName");
        shapeCircle.printShape();
        System.out.println("---------------------------------");

        Circle circle = new Circle("parentCircle - circle","circleName");
        circle.printShape();
        circle.concrete();
        System.out.println("---------------------------------");
        Rectangle rectangle = new Rectangle("parentRectangle - rectangle","rectangleName") {
            @Override
            public void printShape() {
                System.out.println(super.getName());
                System.out.println(this.name);
//                System.out.println("this.name not working");
            }
        }; // Abstract class abstract method implementation
        rectangle.printShape();
        System.out.println("---------------------------------");

        AbWithoutAbMethodChild abMethod = new AbWithoutAbMethodChild();
        abMethod.print();

        System.out.println("## AbstractMain Finished ##");
    }
}
