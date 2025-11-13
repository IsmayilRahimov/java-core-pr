package org.example.generics;

public class BoundedTypeExample {
    public static <T extends Number> void showDoubleValue(T number) {
        System.out.println(number.doubleValue());
    }

    public static <K extends Number> void sim(K karakter) {
        System.out.println(karakter.floatValue());
    }

    public static <L> void show(L karakter) {
        System.out.println(karakter);
    }

    public static void main(String[] args) {
        showDoubleValue(10);
        showDoubleValue(20);
        sim(10.22);
        show('A');
    }
}
