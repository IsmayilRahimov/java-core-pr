package org.example.oop.inheritance;

public class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat");
    }

    public static void main(String[] args) {
        Dog it = new Dog();
        it.eat();
        Animal animal = new Dog();
        animal.eat();
    }

}
