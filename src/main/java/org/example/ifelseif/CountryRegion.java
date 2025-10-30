package org.example.ifelseif;

import java.util.Scanner;

public class CountryRegion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Olkenizi qeyd edin:");
        String country = input.nextLine();

        switch (country) {
            case "Azerbaycan" -> System.out.println("Asia:" + country);
            case "Turkiye" -> System.out.println("Europe:" + country);
            default -> System.out.println("Duzgun olke adi daxil edin:");
        }
        switch (country) {
            case "Rusia":
                System.out.println("Europe and Asia.\nHer iki qitede yerlesir: ");
                break;
        }
    }
}
