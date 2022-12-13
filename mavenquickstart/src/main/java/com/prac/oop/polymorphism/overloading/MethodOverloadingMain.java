package com.prac.oop.polymorphism.overloading;

public class MethodOverloadingMain {

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();

        System.out.println(mo.Multiply(2, 4));
        System.out.println(MethodOverloading.Multiply(2, 7, 3));
        System.out.println(MethodOverloading.Multiply(5.5, 6.3));
    }

}
