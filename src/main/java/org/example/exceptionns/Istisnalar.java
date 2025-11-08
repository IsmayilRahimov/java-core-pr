package org.example.exceptionns;

public class Istisnalar {

    public static void main(String[] args) {


        int a = 10;
        int b = 0;
        try {
            int bol = a / b;
            System.out.println(bol);
        } catch (ArithmeticException e) {
            System.out.println("Xeta!");
        }
    }
}
