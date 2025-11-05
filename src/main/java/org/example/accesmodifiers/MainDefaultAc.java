package org.example.accesmodifiers;

public class MainDefaultAc {
    public static void main(String[] args) {
        DefaultModifier d2 = new DefaultModifier();
        d2.price = 10.2;
        System.out.println(d2);
        d2.add();
    }
}
