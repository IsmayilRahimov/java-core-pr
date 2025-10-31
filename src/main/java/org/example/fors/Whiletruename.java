package org.example.fors;

import java.util.Scanner;

public class Whiletruename {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eded1, eded2;

        while (true) {
            System.out.println("1-ci ededi daxil edin:");
            eded1 = input.nextInt();
            System.out.println("2-ci ededi daxil edin:");
            eded2 = input.nextInt();

            if (eded1 > eded2) {
                System.out.println("1-ci eded 2-ci ededden kicik olmalidir!");
            }
            break;

        }
        int k = eded1;
        System.out.println("Cut ededler:");
        if (k <= eded2) {
            while (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }
    }
}
