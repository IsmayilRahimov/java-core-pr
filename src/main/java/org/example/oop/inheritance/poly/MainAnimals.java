package org.example.oop.inheritance.poly;

public class MainAnimals {
    public static void main(String[] args) {
        Animal animal = new Cat(); // upcasting
        animal.show();
        Cat pisiy = (Cat) animal;  // downcasting
        pisiy.pisik = " Tom";
        System.out.println(pisiy.pisik.getClass().getSimpleName());
        animal.show();
        Animal dogAnimal = new Dog(); // upcasting
        try {
            Dog it = (Dog) animal;
            it.it = "Jason";
            dogAnimal.show();
        } catch (ClassCastException e) {
            System.out.println("Xeta bas verdi: Obyekt Catin referansina beraber oldugu ucun!");
        } finally {
            System.out.println("Duzgun obyekti qurun:");
        }
        Dog it = (Dog) dogAnimal;
        it.it = "Mestan";
        it.show();
    }
}
