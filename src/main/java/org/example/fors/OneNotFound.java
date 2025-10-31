package org.example.fors;

import java.util.Scanner;

public class OneNotFound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int i = 0;

        while (true) {
            System.out.println("1 ededini daxil edin:");
            sayi = input.nextInt();

            if (sayi == 1) {
                System.out.println("1 ededini daxil etmemeli idin!");
                break;

            }
            i++;
        }
    }
}
