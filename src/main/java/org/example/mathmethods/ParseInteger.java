package org.example.mathmethods;

public class ParseInteger {
    public static void main(String[] args) {
        String eded = "55";
        int yeniEded = Integer.parseInt(eded);
        System.out.println(yeniEded + 10);
        int yenieded = Integer.valueOf(eded);
        System.out.println(yenieded + 20);


        char yenieded5 = '1';
        int deyis = Integer.parseInt(String.valueOf(yenieded5));
        System.out.println(deyis);


    }
}
