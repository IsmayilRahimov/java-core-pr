package org.example.controlflow;

import java.util.Scanner;

public class ControlFlowTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("5 ədəd daxil edin:");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". ədəd: ");
            int num = scanner.nextInt();
            sum += num;

            // Cüt və tək yoxlaması
            if (num % 2 == 0) {
                System.out.println(num + " cütdür.");
            } else {
                System.out.println(num + " təkdir.");
            }
        }

        // Cəmin yoxlanması
        if (sum > 50) {
            System.out.println("Cəmi böyükdür: " + sum);
        } else {
            System.out.println("Cəmi kiçikdir: " + sum);
        }

        scanner.close();
    }
}

