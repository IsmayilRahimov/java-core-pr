package org.example.generics;

public class GenericsMethods {

    public static <T> void printValue(T value) {
        System.out.println(value + " :Value");
    }

    public static <K> void showValue(K values) {
        System.out.println(values + " + Generics Mehtods values");
    }

    public static void main(String[] args) {
        printValue("Salam");
        printValue(100.3);
        printValue('K');
        printValue(false);
        showValue(1001);
        showValue("Xirdavat");
    }
}
