package org.example.arraylist;

import java.util.Arrays;

public class ArrayLine {

    public static void main(String[] args) {
        String[] array = {"Samir", "Ali", "Cavid"};
        System.out.println(array);
//        System.out.println(array.toString());
        System.out.println(Arrays.toString(array));
        int[][] num = {{1, 3}, {1, 4}};
        System.out.print(Arrays.deepToString(num));
    }
}
