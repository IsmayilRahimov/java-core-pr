package org.example.exceptionhandling;

import java.lang.ArithmeticException;
import java.util.Scanner;

public class ScannerTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1 -ci ededi daxil edin: ");
        int eded1 = input.nextInt();
        System.out.print("2-ci ededi daxil edin: ");
        int eded2 = input.nextInt();
        System.out.println("Operatoru secin + * / - %");
        char operator = input.next().charAt(0);
        double netice;

        switch (operator) {
            case '+' :
                netice = eded1 + eded2;
                System.out.println("Netice " + netice);
                break;
            case '-' :
                netice = eded1 - eded2;
                System.out.println("Netice " + netice);
                break;
            case '*' :
                netice = eded1 * eded2;
                System.out.println("Netice " + netice);
                break;
            case '/' :
                netice = eded1 / eded2;
                System.out.println("Netice " + netice);
                break;
            case '%' :
                netice = eded1 % eded2;
                System.out.println("Netice " + netice);
                break;
        }

        try {
            netice = eded1 / eded2;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage() + "Xeta bas verdi:");
            System.out.print("0 olmayan bir eded daxil edin:");
            eded2 = input.nextInt();
        }
        System.out.println();


    }
}
