package org.example.exceptionhandling;

import java.lang.ArithmeticException;

public class TryExceptiones {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            int bolme = 150 / 0;
            System.out.println(bolme);
            int saylar = array[41];
            System.out.println(saylar);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik xeta :" + e);
        } finally {
            System.out.println("Davam edir:");
        }
    }
}
