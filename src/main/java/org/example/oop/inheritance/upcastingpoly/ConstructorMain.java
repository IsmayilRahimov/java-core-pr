package org.example.oop.inheritance.upcastingpoly;

public class ConstructorMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        ConstructorSub cons = new ConstructorSub(parent);
        cons.sesCixar();
    }
}
