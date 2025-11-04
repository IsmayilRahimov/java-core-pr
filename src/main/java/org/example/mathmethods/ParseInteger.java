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

        String m = "123456789";
        long newEded = Long.valueOf(m);
        System.out.println(newEded);
        String m1 = "2.4";
        float fOndaliqlieded = Float.parseFloat(m1);
        System.out.println(fOndaliqlieded);
        double dondaliqlieded = Double.valueOf(m1);
        System.out.println(dondaliqlieded);


    }
}
