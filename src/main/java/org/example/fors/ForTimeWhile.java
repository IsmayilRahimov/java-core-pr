package org.example.fors;

import java.util.Scanner;

public class ForTimeWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-ci ededi daxil edin:");
        int eded1 = input.nextInt();
        System.out.println("2-ci ededi daxil edin:");
        int eded2 = input.nextInt();

        if (eded1 >= eded2) {
            System.out.println("1-ci ededi boyuk eded daxil edin:");
            main(args);
        }
        int k = eded1;
        while (k <= eded2) {
            if (k % 2 == 0) {
                System.out.println("Cut ededlerdir:" + k);
            }
            k++;

        }
    }
}
