package org.example.oop.inheritance.encapsulation;

public class PrivateName {
    private String name;

    public PrivateName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        PrivateName p1 = new PrivateName("faiq: constructor name:");
        p1.name = "Samir";
        System.out.println(p1.name);
    }
}
