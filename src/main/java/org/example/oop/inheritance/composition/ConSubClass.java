package org.example.oop.inheritance.composition;

public class ConSubClass {
    public Animal animal;

    public ConSubClass(Animal animal) {
        this.animal = animal;
    }

    public void get() {
        animal.add();
    }
    public void et(){
        animal.showMessage();
    }
}
