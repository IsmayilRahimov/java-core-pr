package org.example.methodstring;

public class ParsStringInteger {
    public static void main(String[] args) {
        int num = 109;
        String eded = String.valueOf(num);
        System.out.println(eded + 10); // 10910
        int newNum = Integer.parseInt(eded);
        System.out.println(newNum + 10);// 119
        double newDouble = Double.parseDouble(eded);
        System.out.println(newDouble);
        double pi = 3.14;
        System.out.println(String.valueOf(pi) + 10);
        char[] karakter = {'a', 'b', 'c', 'd'};
        String newKarakter = String.valueOf(karakter);
        System.out.println(newKarakter);
        int[] massiv = {1, 5, 6, 8, 9};
        String nummassiv = String.valueOf(massiv);
        System.out.println(nummassiv);
    }
}
