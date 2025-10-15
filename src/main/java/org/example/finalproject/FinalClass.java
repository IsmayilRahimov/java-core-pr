package org.example.finalproject;

public class FinalClass {

    static final class Outer2 {
        void show() {
            System.out.println("Static final Outer class");

        }

        public static void main(String[] args) {
            FinalClass.Outer2 h2 = new FinalClass.Outer2();
            h2.show();
        }

    }
}
