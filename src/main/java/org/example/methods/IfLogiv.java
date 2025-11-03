package org.example.methods;

import java.util.Scanner;

public class IfLogiv {
    public static void met(int eded1, int eded2) {
        if (eded1 > eded2) {
            System.out.println("Daxil olunan 1-ci eded boyukdur:" + eded1);
        } else if (eded1 < eded2) {
            System.out.println("Daxil olunan 2-ci eded boyukdur:" + eded2);
        } else if (eded1 == eded2) {
            System.out.println("Daxil etdiyiniz ededler beraberdir:" + eded1 + "=" + eded2);
        } else {
            System.out.println("Duzgun eded daxil edin:");
        }
    }


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("1-ci eded:");
            int eded1 = input.nextInt();
            System.out.println("2-ci eded:");
            int eded2 = input.nextInt();
            met(eded1, eded2);

        }

}
