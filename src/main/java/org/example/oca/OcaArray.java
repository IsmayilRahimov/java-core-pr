package org.example.oca;

public class OcaArray {

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 3;
        arr[1] = arr[0] + 2; //5
        arr[2]++;  //1
        arr[3] = arr[1] + arr[2]; //5+1
        System.out.println(arr[2]); // 1
        System.out.println(arr[3]); // 6
    }
}
