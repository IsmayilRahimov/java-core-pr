package org.example.fors;

import java.util.Scanner;

public class StyWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplamcem = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + "-ci ededi daxil edin:");
            int eded = input.nextInt();
        }
    }
}
