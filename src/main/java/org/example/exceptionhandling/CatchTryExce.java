package org.example.exceptionhandling;

import java.lang.ArithmeticException;

public class CatchTryExce {
    public static void main(String[] args) {
        int[] sayi = {1, 2, 3};

        try {
            int bolme = 300 / 0;
            System.out.println(bolme);
            int eded = sayi[5];
            System.out.println(eded);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xeta bas verdi: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Xeta bas verdi: " + e);
        }finally {
            System.out.println("Proqram davam edir:");
        }
    }
}
