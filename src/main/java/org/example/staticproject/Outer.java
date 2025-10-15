package org.example.staticproject;

public class Outer {
    static String school = "Ada University :";


    static class Inner {
        static void showwMessage() {
            System.out.println(school + "telebesi");
        }

        public static void main(String[] args) {
            Outer.Inner s2 = new Outer.Inner();
            s2.showwMessage();


        }

    }
}
