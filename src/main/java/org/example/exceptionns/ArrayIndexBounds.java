package org.example.exceptionns;

public class ArrayIndexBounds {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};
        try {
            int bolme = 10 / 0;
            int sayi = array[5];
            System.out.println("5-ci indekse beraberdir:");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array bounds xetasi!" +e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic xeta!" + e);
        }
    }
}
