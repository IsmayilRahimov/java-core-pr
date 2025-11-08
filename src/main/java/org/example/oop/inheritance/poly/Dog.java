package org.example.oop.inheritance.poly;

public class Dog extends Animal {
    public String it;

    @Override
    void show() {
        System.out.println("This is child class Dog!" + it);
    }
}
