package com.company;

public class Parent implements Printable {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void print() {

    }
}
