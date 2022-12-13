package com.prac.oop.polymorphism.overloading;

public class MethodOverloading {

//    int Multiply(int a, int b) == static int Multiply(int a, int b)

    int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }

    // Method with 2 integer parameters
//    static int Multiply(int a, int b)
//    {
//        // Returns product of integer numbers
//        return a * b;
//    }

    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }

    // // Multiplication of 3 numbers
    static int Multiply(int a, int b, int c)
    {
        // Return product
        return a * b * c;
    }

}
