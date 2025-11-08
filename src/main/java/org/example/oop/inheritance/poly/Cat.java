package org.example.oop.inheritance.poly;

public class Cat extends Animal {
    public String pisik;

    @Override
    void show() {
        System.out.println("This is child class Cat" + pisik);
    }
}
