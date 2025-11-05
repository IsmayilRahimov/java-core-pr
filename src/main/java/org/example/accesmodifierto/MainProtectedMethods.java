package org.example.accesmodifierto;

import org.example.accesmodifiers.ProtectedMethods;

public class MainProtectedMethods extends ProtectedMethods {

    void run() {
        add();
    }


    public static void main(String[] args) {
        MainProtectedMethods p5 = new MainProtectedMethods();
        p5.add();


    }
}
