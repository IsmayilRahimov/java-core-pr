package org.example.array;

import java.util.Scanner;

public class ScannerInputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrays = new int[10];
        int butunarraycemi = 0;
        int firstandlastsum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Array massivine eded daxil edin:");
            arrays[i] = input.nextInt();
            butunarraycemi += arrays[i];
        }
        firstandlastsum = arrays[0] + arrays[9];
        double oran = firstandlastsum / butunarraycemi;
        System.out.println(firstandlastsum + " -Ilk ededle son ededin cemi:");
        System.out.println("---------------------------------------");
        System.out.println(butunarraycemi + " -Butun ededlerin cemi:");
        System.out.println("---------------------------------------");
        System.out.println(oran + " arrayin faize nisbeti:");


    }
}
