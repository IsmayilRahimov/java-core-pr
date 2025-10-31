package org.example.fors;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cem = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Eded daxil edin:");
            int eded = in.nextInt();
            cem += eded;


        }

        System.out.println(cem);
    }
}
