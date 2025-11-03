package org.example.methods;

public class StaticOrtalama {
    public static double met(int eded1, int eded2) {
        int toplam = eded1 + eded2;
        double ortalama = toplam / 2;
        return ortalama;
    }

    public static void main(String[] args) {
        met(10, 20);
        System.out.println(met(10, 20));
    }
}
