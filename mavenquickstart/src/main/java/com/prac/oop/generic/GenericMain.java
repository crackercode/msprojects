package com.prac.oop.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMain {

    public static void main(String[] args) {

//        T – Type
//        E – Element
//        K – Key
//        N – Number
//        V – Value

        printSingleValue(10);
        printSingleValue("Hello");

        Integer[] intArr = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        String[] stringArray = {"ASD", "ZXC", "qwe"};

        printArray(intArr);
        printArray(doubleArray);
        printArray(stringArray);

        wildCardPrint(Arrays.asList("A","B","C"));

        WildCardClass<String> wildCardClass = new WildCardClass<String>();
        wildCardClass.set("wildCardValue");
        wildCardClass.print();

    }

    private static <E> void printSingleValue(E input) {
        System.out.println(input);
    }

    private static <E> void printArray(E[] inputArray) {
        for (E input : inputArray) {
            System.out.println(input);
        }
    }

    private static void wildCardPrint(List<?> list){
        System.out.println(list);
    }
}
