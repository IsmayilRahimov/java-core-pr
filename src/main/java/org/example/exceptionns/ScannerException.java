package org.example.exceptionns;

import java.util.Scanner;

public class ScannerException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-ci ededi daxil edin!");
        int eded1 = input.nextInt();
        System.out.println("2-ci ededi daxil edin!");
        int eded2 = input.nextInt();
        int sonluq;
        try {
            sonluq = eded1 / eded2;

        } catch (ArithmeticException e) {
            System.out.println("0/a bolmek olmaz \n 2-ci ededi yeniden daxil edin!");
            eded2 = input.nextInt();
        } finally {
            System.out.println();
        }
        sonluq  = eded1/eded2;
        System.out.println(sonluq);
    }
}
