package org.example.exceptionhandling;

import java.lang.ArithmeticException;

public class ArithmeticHandling {


    public void checkage2(int age) throws Exception {
        if (age > 18) {
            throw new Exception("Yasiniz cox oldugu ucun daxil olmaz:");
        } else {
            System.out.println("Daxil ola bilersiz:");
        }
    }

    public static void main(String[] args) throws Exception {
        ArithmeticHandling a1 = new ArithmeticHandling();
        try {
            a1.checkage2(25);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Xeta bas verdi:");
        } finally {
            System.out.println("Proqram davam edir");

        }
    }
}
