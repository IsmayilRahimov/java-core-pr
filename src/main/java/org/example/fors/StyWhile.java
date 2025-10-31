package org.example.fors;

import java.util.Scanner;

public class StyWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplamcem = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "-ci ededi daxil edin:");
            int eded = input.nextInt();
        }

        int reqem = 0;
        while (reqem < 10) {
            System.out.println("ededi gotur:");
            reqem++;
        }

        int mes = 0;

        do {
            System.out.println("Ededi cap et");
            mes++;
        } while (mes < 10);

//        do {
//            int k=  0;
//            System.out.println("Sonsuz dovr:" + k);
//            k++;
//        } while (k < 5);
    }
}
