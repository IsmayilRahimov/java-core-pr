package org.example.ifelseif;

import java.util.Scanner;

public class InputCanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vize not: ");
        int vizeNot = input.nextInt();
        System.out.println("Final not: ");
        int finalnot = input.nextInt();

        double ortalama = vizeNot * 0.4 + finalnot * 0.6;

        if (ortalama >= 51) {
            System.out.println("Sizin ortalama bal :" + ortalama + " Tebrik edirik:");
        } else if (ortalama < 0) {
            System.out.println("Sizin baliniz 0 -dan asagi oldugu ucun kesildiniz:" + ortalama);
        } else if (ortalama < 51) {
            System.out.println("Siz novbeti defe imtahan vermeli olacaqsiz:" + ortalama);
        }

    }
}
