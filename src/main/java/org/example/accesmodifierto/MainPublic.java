package org.example.accesmodifierto;

import org.example.accesmodifiers.PublicMethods;

public class MainPublic {
    public static void main(String[] args) {
        PublicMethods p1 = new PublicMethods();
        p1.add();
        p1.price = 3.5;
        p1.name = "Anar";
        p1.surname = "Azadov";
    }
}
