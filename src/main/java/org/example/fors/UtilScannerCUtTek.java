package org.example.fors;

import java.util.Scanner;

public class UtilScannerCUtTek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cutEded = 0;
        int tekEded = 0;

        int i = 1;
        int sayi;
        while (i <= 10) {
            System.out.print(i + "-ci ededi girin");
            sayi = input.nextInt();
            if (i % 2 == 0) {
                cutEded += sayi;
            } else {
                tekEded += sayi;
            }
            i++;
        }

        System.out.println("Tek ededler" + tekEded);
        System.out.println("Cut ededler" + cutEded);
    }
}
