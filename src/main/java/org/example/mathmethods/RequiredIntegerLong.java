package org.example.mathmethods;

public class RequiredIntegerLong {
    public static void main(String[] args) {
        String ededler = "534";
        int deyisenEdedler = Integer.parseInt(ededler);
        deyisenEdedler = Integer.valueOf(ededler);
        System.out.println(deyisenEdedler);
        String ondaliqliEded = "2.5";
        double yeniOndaliqli = Double.valueOf(ondaliqliEded);
        System.out.println(yeniOndaliqli);
        float f = Float.parseFloat(ondaliqliEded);
        System.out.println(f);

        double tamonda = 25.5;
        int tameded = (int) tamonda;
        System.out.println(tameded);



    }
}
