package org.example.exceptionns;

import org.example.exceptionscatch.AgeExceptionn;

public class ThrowAdd {

    public static void konumHesablama(int konumNo) {
        if (konumNo == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println("Konum hesablanir:" + konumNo);
        }
    }

    public static void yasHesablama(int yas) {
        if (yas < 18) {
            throw new ArithmeticException();
        } else {
            System.out.println("Yas hesablanir:" + yas);
        }
    }

    public static void main(String[] args) {
        konumHesablama(0);
        yasHesablama(24);

    }
}
