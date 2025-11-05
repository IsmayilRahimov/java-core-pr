package org.example.accesmodifiers;

public class PublicMethods {
    public String name;
    public String surname;
    public double price;

    public void add() {
        System.out.println(name + surname + price + " Public acces modifier:");
    }
}
