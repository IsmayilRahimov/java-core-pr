package org.example.ifelseif;

import java.util.Scanner;

public class OperateScan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int eded = in.nextInt(); // 10
        int result;
        eded += 5; //15
        eded *= 5;  //75
        eded -= 5; // 70
        eded /= 5; // 13.5
        System.out.println(eded);
        result = eded + 5;
        System.out.println(result);
    }
}
