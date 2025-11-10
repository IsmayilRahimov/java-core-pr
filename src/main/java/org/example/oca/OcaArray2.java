package org.example.oca;

public class OcaArray2 {

    public static void main(String[] args) {
        int[][] arrays = new int[2][3];
        arrays[0][1] = 4;
        arrays[1] = arrays[0];
        arrays[1][2] = 7;
        System.out.println(arrays[0][2]);
        System.out.println(arrays[1][1]);
    }
}
