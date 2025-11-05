package org.example.methodstring;

public class ValueOf {
    public static void main(String[] args) {
        String defaultname = "55677";
        int yeniDefault = Integer.valueOf(defaultname);
        System.out.println(yeniDefault + "Integer");

        String name = "   Java Language    ";
        System.out.println(name.trim());
        System.out.println(name.concat(" Best practice"));
        System.out.println(name.length());
        System.out.println(name.replace("Ja", "Ba"));
        System.out.println(name.indexOf("L"));
        System.out.println(name.charAt(5));
        System.out.println(name.substring(5, 10));
        System.out.println(name.contains("Java"));
        System.out.println(name.isEmpty());
        System.out.println(name.substring(10, 15));
        System.out.println(name.trim());
        System.out.println(name.replace("Ja", "La"));


    }
}
