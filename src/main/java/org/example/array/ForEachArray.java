package org.example.array;

import java.util.Arrays;

public class ForEachArray {
    public static void main(String[] args) {
        int[] ededler = {1, 5, 9, 15, 159, 59};
        String[] names = {"Vaqif", "Imran", "Kamran", "Emin"};
        for (int eded : ededler) {
            System.out.println(eded);
        }
        for (int a = 0; a < ededler.length; a++) {
            System.out.println(ededler[a]);
        }
        for (String name : names) {
            if (name.contains("Imran")) {
                break;
            } else {
                System.out.println(name);
            }

        }

    }
}
