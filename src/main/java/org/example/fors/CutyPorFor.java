package org.example.fors;

import java.util.Scanner;

public class CutyPorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tekeded = 0;
        int cuteded = 0;
        int sayi;

        int i = 1;
        while (i <= 10) {

            System.out.println(i + "-ci ededi giriniz");
            sayi = input.nextInt();

            if (i % 2 == 0) {
                cuteded += sayi;
            } else if (i % 2 != 0) {
                tekeded += sayi;
            }
            i++;
        }
        System.out.println("Cut ededler " + cuteded);
        System.out.println("Tek ededler " + tekeded);
    }
}
