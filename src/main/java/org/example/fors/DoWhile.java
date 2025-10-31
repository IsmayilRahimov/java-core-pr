package org.example.fors;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eded;
        int sum = 0;

        do {
            System.out.println("eded daxil edin:");
            eded = input.nextInt();
            sum += eded;
        } while (eded != 5);
        System.out.println(sum);
    }
}
