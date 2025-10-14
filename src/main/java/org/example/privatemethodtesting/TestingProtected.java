package org.example.privatemethodtesting;

import org.example.accesmodifier.ProtectedSubPackage;

public class TestingProtected extends ProtectedSubPackage {

    @Override
    protected void showMessage(String name) {
        System.out.println("Yalniz subclass ve package lerde cagirmaq mumkundur:");

    }
}
