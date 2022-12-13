package com.prac.oop.generic;

public class WildCardClass<T> {

    private T obj;

    void set(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }

    void print() {
        System.out.print(this.obj);
    }

}
