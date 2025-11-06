package org.example.accesmodifiers;

import org.example.accesmodifier.PrivateMethodAccess;

import static org.example.accesmodifiers.ProtectedMethodsAcces.show;

public class MainlesPrivate {

    public static void main(String[] args) {
        PrivateFilds p2 = new PrivateFilds();
        p2.setName("Faiq");
        p2.getName();
        ProtectedMethodsAcces p1 = new ProtectedMethodsAcces();
        show();


    }
}
