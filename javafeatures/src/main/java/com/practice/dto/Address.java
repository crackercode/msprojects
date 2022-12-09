package com.practice.dto;

public class Address {

    private int no;
    private String street;
    private String city;

    public Address(int no, String street, String city) {
        this.no = no;
        this.street = street;
        this.city = city;
    }

    public int getNo() {
        return no;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "no=" + no +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
