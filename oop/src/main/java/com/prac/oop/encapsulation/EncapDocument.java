package com.prac.oop.encapsulation;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class EncapDocument {

    public static int count = 0;
    private static int encapsulationCount = 0;

    public void printCount() {
        System.out.println("Document count is : " + count);
        System.out.println("Document encapsulationCount is : " + encapsulationCount);
    }

    public void setEncapsulationCount(int encapsulationCount) throws InvalidArgumentException {
        if (encapsulationCount > 0) {
            EncapDocument.encapsulationCount = encapsulationCount;
        }else{
            String[] msg = {"Minus umber"};
            throw new InvalidArgumentException(msg);
        }
    }
}
