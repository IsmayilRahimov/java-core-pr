package org.example.array;

public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 10;
        arr[0][1] = 15;
        arr[0][2] = 20;
        arr[1][0] = 25;
        arr[1][1] = 30;
        arr[1][2] = 35;
        arr[2][0] = 40;
        arr[2][1] = 45;
        arr[2][2] = 50;
        System.out.println(arr[2][1]);
        int[][] arrays = {{150, 200, 300}, {500, 600, 700}, {1000, 2000, 3000}};
        System.out.println(arrays[1][2]);


    }
}
