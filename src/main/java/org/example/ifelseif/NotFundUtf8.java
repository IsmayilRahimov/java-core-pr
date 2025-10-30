package org.example.ifelseif;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class NotFundUtf8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.print("Ölkə adını daxil et: ");
        String country = input.nextLine();

        // Boş giriş yoxlaması
        if (country.isEmpty()) {
            System.out.println(" Ölkə adı boş ola bilməz!");
        } else {
            System.out.println("Daxil edilən ölkə: " + country);
        }

        input.close();

        int eded = 10;
        eded += 5;
        eded -= 5;
        System.out.println(eded);
    }
}

