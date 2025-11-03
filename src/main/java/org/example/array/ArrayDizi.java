package org.example.array;

import java.util.Arrays;

public class ArrayDizi {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9};
        String[] arrName = {"Samir", "Musa", "Guseyn"};
//        System.out.println(arr[2]);
//        System.out.println(arrName[1]);

        for (int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i]);
        }
        System.out.println(arrName.length);

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
