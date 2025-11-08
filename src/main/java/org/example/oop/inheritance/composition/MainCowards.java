package org.example.oop.inheritance.composition;

public class MainCowards {

    public static void main(String[] args) {
        Animal animal = new Animal();
        ConSubClass c1 = new ConSubClass(animal);
        c1.get();
        c1.et();
    }
}
