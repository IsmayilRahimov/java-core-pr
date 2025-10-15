package org.example.exceptionhandling;

import java.lang.ArithmeticException;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1-ci ededi daxil edin: ");
        int eded1 = input.nextInt();
        System.out.print("2-ci ededi daxil edin: ");
        int eded2 = input.nextInt();
        double cavab;

        try {
            cavab = eded1 / eded2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Xeta bas verdi");
            System.out.print("2-ci eded 0 olmayaraq yeniden eded daxil edin:");
            eded2 = input.nextInt();
            cavab = eded1 / eded2;
        }
        System.out.println(cavab);
    }
}
