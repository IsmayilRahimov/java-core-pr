package org.example.ifelseif;

import java.util.Scanner;

public class SwictchCaseImport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Necenci sinifde oxuyursunuz?");
        byte sinif = input.nextByte();
        switch (sinif) {
            case 1:
                System.out.println("Ibtidai");
                break;
            case 5:
                System.out.println("Orta");
                break;
            case 9:
                System.out.println("Ali");
                break;
            default:
                System.out.println("Duzgun reqem daxil edin:");

        }
    }
}
