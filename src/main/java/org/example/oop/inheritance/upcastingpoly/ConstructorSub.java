package org.example.oop.inheritance.upcastingpoly;

public class ConstructorSub {
    public Parent parent;

    public ConstructorSub(Parent parent) {
        this.parent = parent;
    }

    public void sesCixar() {
        parent.add();
    }
}
