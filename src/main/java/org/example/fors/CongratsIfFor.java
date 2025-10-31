package org.example.fors;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class CongratsIfFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-ci ededi daxil edin");
        int eded1 = input.nextInt();
        System.out.println("2-ci ededi daxil edin");
        int eded2 = input.nextInt();

//        for (int i = eded1; i <= eded2; i++) {
//            if (i % 2 != 0) {
////                System.out.println(i + "-Tek ededler: ");
//            } else if (i % 2 == 0) {
//                System.out.println(i + "Cut ededler:");
//
//            }
//        }

        int k = eded1;
        while (k <= eded2) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }
    }
}
