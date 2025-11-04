package org.example.methodstring;

public class StringExampleMethods {


    public static void main(String[] args) {
        String ad = "      Ragimov     :";
        System.out.println(ad);
        System.out.println(ad.contains("Ra"));
        System.out.println(ad.charAt(4));
        System.out.println(ad.substring(1, 4));
        System.out.println(ad.indexOf("i"));
        System.out.println(ad.replace("Ra", "Sa"));
        System.out.println(ad.trim());

        String cumle = "Salam Azerbaycan Xalqi";
        String[] cumleler = cumle.split(" ");
        System.out.println(cumleler[0]);
        System.out.println(cumleler[1]);
        String sozler = "Xos geldiniz Tesekkur";
        String[] m = sozler.split(" ");
        System.out.println(m[0]);
        System.out.println(m[2]);
        System.out.println(m.length);
        System.out.println(sozler.length());
        String balaca = sozler.toLowerCase();
        System.out.println(balaca);
        String a = sozler.toLowerCase();
        System.out.println(a);
        String boyuk = sozler.toUpperCase();
        System.out.println(boyuk);
        System.out.println(boyuk.trim());
        String ma = "   Azerbaycan   ";
        System.out.println(ma.trim());
        String name = "Faiq ";
        String soyad = "Azadov";
        String adsoyad = name.concat(soyad);
        System.out.println(adsoyad);
        String adim = "Ismayil";
        adim = adim.concat(" ");
        String surname = "Ragimov";
        adim.concat(surname);
        System.out.println(adim);
    }
}
