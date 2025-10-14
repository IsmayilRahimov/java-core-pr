package org.example.operators;

public class LocigalOperatorsPro {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        System.out.println(a < b || a != b);  //true
        System.out.println(a > b && a < b || a <= b);  //false
        System.out.println(a < b && a <= b); // false
    }
}
