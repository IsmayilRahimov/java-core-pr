package org.example.oop.inheritance.upcastingpoly;

public class Child extends Parent {

    public int age;

    @Override
    public void add() {
        System.out.println(age + ":Ovladin yasi.");
    }

}
