package org.example.accesmodifiers;

public class PrivateMethodPublicAcces {

    private static void add() {
        System.out.println("This is private method only public access!");
    }

    public static void show() {
        add();
    }

    public static void main(String[] args) {
        show();
    }

}
