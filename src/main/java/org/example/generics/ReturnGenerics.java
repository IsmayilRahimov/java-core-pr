package org.example.generics;

public class ReturnGenerics {

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

    public static <K> K getLegend(K[] massiv) {
        return massiv[6];
    }


    public static void main(String[] args) {
        String[] names = {"Samir", "ELi", "Subhan"};

        try {
            Integer[] numbers = {10, 20, 40, 50, 60, 70};
            System.out.println(getLegend(numbers));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " Xetanin sebebi");
        }
        System.out.println(getFirst(names));
    }
}
