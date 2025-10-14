package org.example.operators;

public class TernaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int max = (a > b) ? a : b; //eger a > b true dursa max A, yox deyilse max = b;
        System.out.println(max);

        int suma = (a <= b) ? a : b;
        System.out.println(suma);

    }
}
