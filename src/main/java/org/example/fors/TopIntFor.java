package org.example.fors;

import java.util.Scanner;

public class TopIntFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eded;
        int cem = 0;

        while (true) {
            System.out.println("Eded daxil edin");
            eded = input.nextInt();
            if (eded == 0) {
                break;
            } else {
                cem += eded;
            }
        }
        System.out.println(cem + " ededlerin cemi:");
    }
}
