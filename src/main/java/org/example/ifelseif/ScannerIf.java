package org.example.ifelseif;

import java.util.Scanner;

public class ScannerIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daxil et: ");
        int sayi = scanner.nextInt();
        if (sayi > 100) {
            sayi = sayi * 2;
        } else {
            sayi = sayi / 2;
        }
        System.out.println(sayi);

    }
}
