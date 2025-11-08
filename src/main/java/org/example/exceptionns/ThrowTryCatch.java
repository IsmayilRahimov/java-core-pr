package org.example.exceptionns;

import java.io.IOException;

public class ThrowTryCatch {
    public static void yasKontrol(int yas) throws IOException {
        if (yas < 18) {
            throw new IOException();
        } else {
            System.out.println("Yasal yasdasiniz");
        }
    }

    public static void main(String[] args) {
        try {
            yasKontrol(15);
        } catch (IOException e) {
            System.out.println("Yasiniz 18 den azdir:");
        }
    }
}
