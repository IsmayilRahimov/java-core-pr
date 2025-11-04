package org.example.methodstring;

public class StringExampleMethods {


    public static void main(String[] args) {
        String ad = "Ragimov";
        System.out.println(ad);
        System.out.println(ad.contains("Ra"));
        System.out.println(ad.charAt(4));
        System.out.println(ad.substring(1, 4));
        System.out.println(ad.indexOf("i"));
        System.out.println(ad.replace("Ra", "Sa"));

        String cumle = "Salam Azerbaycan Xalqi";
        String[] cumleler = cumle.split(" ");
        System.out.println(cumleler[0]);
        System.out.println(cumleler[1]);
        String sozler = "Xos geldiniz Tesekkur";
        String[] m = sozler.split(" ");
        System.out.println(m[0]);
        System.out.println(m[2]);
    }
}
