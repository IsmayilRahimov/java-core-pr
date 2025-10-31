package org.example.ifelseif;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElseComp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Reqem daxil edin");
            int eded = in.nextInt();
            int eded2 = in.nextInt();
            int eded3 = in.nextInt();
            if (eded % 2 == 0 || eded2 % 2 == 0 || eded3 % 2 == 0) {
                System.out.println("Congrats");
            } else {
                System.out.println("Failed");
            }
        }


    }
}
