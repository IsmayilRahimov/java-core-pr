package org.example.oop.inheritance.polymorphism;

public class Main {
    public static void main(String[] args) {

        Parent p1 = new Child();
        p1.parentVariable = "A";
        ((Child) p1).childVariable = "B";

        //runtime polymorpishm
    }
}
