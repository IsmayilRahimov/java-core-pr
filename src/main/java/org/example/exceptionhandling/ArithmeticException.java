package org.example.exceptionhandling;

public class ArithmeticException {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;


        try {
            int bol = a / b;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("0-a bolmek olmaz");
        } finally {
            System.out.println("Xeta olsada proqram davam edir:");
        }

    }
}
