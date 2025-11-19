package org.example.intervyo;

public class ArraySum {


    public static void main(String[] args) {


        int[] array = {1, 5, 7, 3};

        int sum = 0;

        for (int n : array) {
            sum += n;
        }
        System.out.println(sum);
    }
}
