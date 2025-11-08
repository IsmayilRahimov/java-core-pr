package org.example.exceptionns;

import java.lang.NullPointerException;

public class CatchThrow {

    public static void girisAdi(String name) {
        if (name == null) {
            throw new NullPointerException();
        } else if (name.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("Adiniz dogru oldugu ucun daxil ola bilersiniz:");
        }
    }

    public static void main(String[] args) {
        try {
            girisAdi("");

        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Xeta!" + e);
        }
    }
}
