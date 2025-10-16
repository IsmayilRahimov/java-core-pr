package org.example.finalitiy;

import org.example.finalproject.FinalClass;

public class ClaimFinal extends FinalClass {

    static {
        System.out.println("Bu static blokdur:-:");
    }

    ClaimFinal() {
        System.out.println("Bos konstruktor ile:");
    }

    public static void main(String[] args) {
        System.out.println("Main methodu ile:");
        ClaimFinal c1 = new ClaimFinal();


    }

}
