package org.example.fors;

import java.util.Scanner;

public class ForWhileInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cutEdedCemi = 0;
        int tekEdedCemi = 0;

        int daxilOlanEded;
        int i = 1;
        while (i <= 10) {
            System.out.println(i + "-ci ededi daxil edin: ");
            daxilOlanEded = input.nextInt();
            if (daxilOlanEded % 2 == 0) {
                cutEdedCemi += daxilOlanEded;
            } else if (daxilOlanEded % 2 != 0) {
                tekEdedCemi += daxilOlanEded;
            }
            i++;
        }
        System.out.println("--------------------------------------------");
        System.out.println(cutEdedCemi + "-Cut ededlerin cemi");
        System.out.println(tekEdedCemi + "-Tek ededlerin cemi");
    }
}
