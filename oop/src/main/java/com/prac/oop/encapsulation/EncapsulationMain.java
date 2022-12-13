package com.prac.oop.encapsulation;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class EncapsulationMain {

    public static void main(String[] args) throws InvalidArgumentException {

        //Encapsulation
        EncapDocument document = new EncapDocument();
        document.count++;
//        document.encapsulationCount= 10; hide data from other classes
        document.setEncapsulationCount(10);
        document.printCount();

        System.out.println("Done");

    }

}
