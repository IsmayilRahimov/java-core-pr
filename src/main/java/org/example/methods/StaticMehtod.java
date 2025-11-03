package org.example.methods;

import java.util.Scanner;

public class StaticMehtod {

    static void ortalama(int eded1, int eded2) {
        int sum = eded1 + eded2;
        double ortalama = sum / 2;
        System.out.println(ortalama + " Methodun ortalamasi;");


    }

    public static void main(String[] args) {
        ortalama(10, 20);
        Scanner input = new Scanner(System.in);
        System.out.println("1-ci ededi daxil edin:");
        int reqem1 = input.nextInt();
        System.out.println("2-ci ededi daxil edin:l");
        int reqem2 = input.nextInt();

        ortalama(reqem1, reqem2);
        main(args);

    }
}
