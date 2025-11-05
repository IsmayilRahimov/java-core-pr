package org.example.accesmodifierto;

import org.example.accesmodifiers.PrivateMethods;

public class MainPrivate {

    public static void main(String[] args) {
        PrivateMethods p1 = new PrivateMethods();
        p1.setName("Anar");
        p1.setAge(19);
        System.out.println(p1.getAge() + p1.getName());


    }
}
