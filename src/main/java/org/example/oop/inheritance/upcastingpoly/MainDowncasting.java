package org.example.oop.inheritance.upcastingpoly;

public class MainDowncasting {
    public static void main(String[] args) {
        Parent valideyn = new Child(); // upcasting
        System.out.println(valideyn.getClass().getSimpleName()); //
        Child usaq = (Child) valideyn; // downcasting;
        usaq.age = 16;
        System.out.println(usaq.getClass().getSimpleName());
        valideyn.add();
    }
}
